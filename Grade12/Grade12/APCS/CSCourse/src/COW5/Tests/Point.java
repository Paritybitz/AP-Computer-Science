package COW5.Tests;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Point{
    private int     x, y;
    private Color   theColor;
    private int     size;   //radius, a point has no dimensions, this just indicates how big its marker is

    //create costructor
    public Point(int aX, int aY, Color aColor, int aSize){
        x = aX;
        y = aY;
        theColor = aColor;
        size = aSize;
    }

    public int getX(){return x;}
    public int getY(){return y;}

    public void paint(Graphics g){
        g.setColor(theColor);
        int realY = 400 - y;
        g.fillOval(x-size/2, realY-size/2, size, size);
        //g.drawLine(x, realY, x, 400);

    }

}