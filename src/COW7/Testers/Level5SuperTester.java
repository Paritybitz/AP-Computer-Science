package COW7.Testers;

import COW7.Point;
import COW7.Polygon;

import java.awt.*;

public class Level5SuperTester
{
    
    public static boolean testLevel5(){
        int[] xValues = {200, 600, 600, 400, 400, 0};
        int[] yValues = {200, 200, 600, 800, 400, 400};
        boolean success = true;
        Polygon thePolygon;
        COW7.Point[] adjustedPoints;
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.stretchHorizontally(3.5);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesStretchH = {700, 2100, 2100, 1400, 1400, 0};
        int[] yValuesStretchH = {200, 200, 600, 800, 400, 400}; 
        if(!arePointsAccurate(adjustedPoints, xValuesStretchH, yValuesStretchH)){
            System.out.println("stretchHorizontally not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.stretchVertically(.1);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesStretchV = {200, 600, 600, 400, 400, 0};
        int[] yValuesStretchV = {20, 20, 60, 80, 40, 40}; 
        if(!arePointsAccurate(adjustedPoints, xValuesStretchV, yValuesStretchV)){
            System.out.println("stretchVertically not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.dilate(400, 400, 2);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesDilate = {0, 800, 800, 400, 400, -400};
        int[] yValuesDilate = {0, 0, 800, 1200, 400, 400};
        if(!arePointsAccurate(adjustedPoints, xValuesDilate, yValuesDilate)){
            System.out.println("dilate not working");
            success = false;
        }
        
        return success;
    }
    
    
    
    public static Polygon generatePolygon(int[] xValues, int[] yValues){
        COW7.Point[] points = new COW7.Point[xValues.length];
        for(int i = 0; i < points.length; i++){
            int red = (int)(256 * Math.random());
            int green = (int)(256 * Math.random());
            int blue = (int)(256 * Math.random());
            Color randomColor = new Color(red, green, blue);
            points[i] = new Point(xValues[i], yValues[i], randomColor, 20);
        }
        return new COW7.Polygon(points, Color.BLACK);
    }
    
    public static boolean arePointsAccurate(Point[] thePoints, int[] xValues, int[] yValues){
        if(thePoints.length != xValues.length){
            return false;
        }
        for(int i = 0; i < xValues.length; i++){
            if(Math.abs(thePoints[i].getX() - xValues[i]) > 1){
                System.out.println("X values does not match");
                return false;
            }
            if(Math.abs(thePoints[i].getY() - yValues[i]) > 1){
                System.out.println("Y values does not match");
                return false;
            }
        }
        return true;
    }
}