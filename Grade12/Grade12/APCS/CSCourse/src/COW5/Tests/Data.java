package COW5.Tests;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Data{
    Point [] thePoints;
    Color theColor;
    private static final int sizeOfDot = 8, spacing = 20;
    public Data(Point [] somePoints){
        thePoints = somePoints;
    }

    public Data(double [] values, Color theColor){
        thePoints = new Point [values.length];
        this.theColor = theColor;
        for(int i = 0; i < thePoints.length; i++){
            thePoints[i] = new Point(i * spacing + sizeOfDot, (int)(values[i]), theColor, sizeOfDot);
        }
    }

    public void paint(Graphics g){
        for(int i = 0; i < thePoints.length; i++){
            thePoints[i].paint(g);
        }
        g.setColor(theColor);
        for(int i = 1; i < thePoints.length; i++){
            g.drawLine(thePoints[i-1].getX(), 400 - thePoints[i-1].getY(), thePoints[i].getX(), 400 - thePoints[i].getY());
        }
    }

}