package COW7.Testers;

import COW7.Point;
import COW7.Polygon;

import java.awt.*;

public class Level4SuperTester
{
    
    public static boolean testLevel4(){
        int[] xValues = {200, 600, 600, 400, 400, 0};
        int[] yValues = {200, 200, 600, 800, 400, 400};
        boolean success = true;
        Polygon thePolygon;
        Point[] adjustedPoints;
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.reflectAcrossX(524);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesReflectX = {848, 448, 448, 648, 648, 1048};
        int[] yValuesReflectX = {200, 200, 600, 800, 400, 400}; 
        if(!arePointsAccurate(adjustedPoints, xValuesReflectX, yValuesReflectX)){
            System.out.println("reflectAcrossX not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.reflectAcrossY(450);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesReflectY = {200, 600, 600, 400, 400, 0};
        int[] yValuesReflectY = {700, 700, 300, 100, 500, 500}; 
        if(!arePointsAccurate(adjustedPoints, xValuesReflectY, yValuesReflectY)){
            System.out.println("reflectAcrossY not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        thePolygon.reflectAcrossYequalX();
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesYeX = {200, 200, 600, 800, 400, 400};
        int[] yValuesYeX = {200, 600, 600, 400, 400, 0};
        if(!arePointsAccurate(adjustedPoints, xValuesYeX, yValuesYeX)){
            System.out.println("reflectAcrossYequalX not working");
            success = false;
        }
        
        return success;
    }
    
    
    
    public static Polygon generatePolygon(int[] xValues, int[] yValues){
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
