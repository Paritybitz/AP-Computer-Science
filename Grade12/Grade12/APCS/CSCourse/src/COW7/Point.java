package COW7;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Point{
    private double     x, y;
    private Color   theColor;
    private int     radius;
    
    //create costructor
    public Point(double x, double y, Color aColor, int radius){
        this.x = x;
        this.y = y;
        theColor = aColor;
        this.radius = radius;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void moveRight(double amount){
        x += amount;
    }
    
    public void moveLeft(double amount){
        x -= amount;
    }
    
    public void moveUp(double amount){
        y -= amount;
    }
    
    public void moveDown(double amount){
        y += amount;
    }
    
    public void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }

    public void paint(Graphics g){ 
        g.setColor(theColor);
        g.fillOval((int)x-radius, (int)y-radius, radius*2, radius*2);
        
    }

    public double getDistance(Point p){
        double retVal = Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));

        return retVal;
    }
    
}