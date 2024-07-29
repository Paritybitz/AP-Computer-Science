package COW7.Testers;

import COW7.Point;
import COW7.Polygon;

import java.awt.*;

public class Level2SuperTester{

    public static boolean testLevel2(){
        int[] xValues = {200, 600, 600, 400, 400, 0};
        int[] yValues = {200, 200, 600, 800, 400, 400};
        boolean success = true;
        Polygon thePolygon;
        Point[] adjustedPoints;
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.moveRight(24);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesRight = {224, 624, 624, 424, 424, 24};
        int[] yValuesRight = {200, 200, 600, 800, 400, 400}; 
        if(!arePointsAccurate(adjustedPoints, xValuesRight, yValuesRight)){
            System.out.println("moveRight not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.moveLeft(13);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesLeft = {187, 587, 587, 387, 387, -13};
        int[] yValuesLeft = {200, 200, 600, 800, 400, 400}; 
        if(!arePointsAccurate(adjustedPoints, xValuesLeft, yValuesLeft)){
            System.out.println("moveLeft not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.moveUp(30);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesUp = {200, 600, 600, 400, 400, 0};
        int[] yValuesUp = {170, 170, 570, 770, 370, 370}; 
        if(!arePointsAccurate(adjustedPoints, xValuesUp, yValuesUp)){
            System.out.println("moveUp not working");
            success = false;
        }
        
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.moveDown(150);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesDown = {200, 600, 600, 400, 400, 0};
        int[] yValuesDown = {350, 350, 750, 950, 550, 550}; 
        if(!arePointsAccurate(adjustedPoints, xValuesDown, yValuesDown)){
            System.out.println("moveDown not working");
            success = false;
        }
        
        return success;
    }
    
    
    
    public static COW7.Polygon generatePolygon(int[] xValues, int[] yValues){
        Point[] points = new Point[xValues.length];
        for(int i = 0; i < points.length; i++){
            int red = (int)(256 * Math.random());
            int green = (int)(256 * Math.random());
            int blue = (int)(256 * Math.random());
            Color randomColor = new Color(red, green, blue);
            points[i] = new Point(xValues[i], yValues[i], randomColor, 20);
        }
        return new Polygon(points, Color.BLACK);
    }
    
    public static boolean arePointsAccurate(Point[] thePoints, int[] xValues, int[] yValues){
        if(thePoints.length != xValues.length){
            return false;
        }
        for(int i = 0; i < xValues.length; i++){
            if(thePoints[i].getX() != xValues[i]){
                System.out.println("X values does not match");
                return false;
            }
            if(thePoints[i].getY() != yValues[i]){
                System.out.println("Y values does not match");
                return false;
            }
        }
        return true;
    }

}
