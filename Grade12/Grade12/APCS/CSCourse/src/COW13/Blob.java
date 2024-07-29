package COW13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;

public class Blob
{
    int radius;
    Color theColor;
    int x, y;
    int deltaX, deltaY;

    public Blob(int aRadius, Color aColor, int aX, int aY, int aDeltaX, int aDeltaY){
        radius = aRadius;
        theColor = aColor;
        x = aX;
        y = aY;
        deltaX = aDeltaX;
        deltaY = aDeltaY;
    }

    //returns the x coordinate of the blob
    public int getX(){
        return x;
    }

    //returns the y coordinate of the blob
    public int getY(){
        return y;
    }

    //returns the radius of the blob
    public int getRadius(){
        return radius;
    }

    //increases the size(radius) of the blob
    public void eat(){
        radius += 2;
        if (theColor.getRed() < 255) {
            theColor = new Color(theColor.getRed() + 10, theColor.getGreen(), theColor.getBlue());
        }
    }

    //moves the blob on its current path
    public void move(){
        x += deltaX;
        y += deltaY;
    }

    //has the blob increase its velocity to the right
    public void moveRight(){
        deltaX++;
    }

    //has the blob increase its velocity to the left
    public void moveLeft(){
        deltaX--;
    }

    //has the blob increase its velocity up
    public void moveUp(){
        deltaY--;
    }

    //has the blob increase its velocity down
    public void moveDown(){
        deltaY++;
    }
    public void draw(Graphics g){
        g.setColor(theColor);
        g.fillOval(x-radius, y-radius, 2*radius+1, 2*radius+1);
    }
}