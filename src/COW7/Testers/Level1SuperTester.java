package COW7.Testers;

import COW7.Point;
import COW7.Polygon;

import java.awt.*;

public class Level1SuperTester{

    public static boolean testLevel1(){
        int[] xValues = {200, 600, 600, 400, 400, 0};
        int[] yValues = {200, 200, 600, 800, 400, 400};
        boolean success = true;
        Polygon thePolygon;
        Point[] adjustedPoints;
        
        thePolygon = generatePolygon(xValues, yValues);
        adjustedPoints = thePolygon.getPoints();
        int[] xValuesRight = {200, 600, 600, 400, 400, 0};
        int[] yValuesRight = {200, 200, 600, 800, 400, 400};
        if(!arePointsAccurate(adjustedPoints, xValuesRight, yValuesRight)){
            System.out.println("moveRight not working");
            success = false;
        }
        
        
        return success;
    }
    
    
    
    public static COW7.Polygon generatePolygon(int[] xValues, int[] yValues){
        Point[] points = new COW7.Point[xValues.length];
        for(int i = 0; i < points.length; i++){
            int red = (int)(256 * Math.random());
            int green = (int)(256 * Math.random());
            int blue = (int)(256 * Math.random());
            Color randomColor = new Color(red, green, blue);
            points[i] = new Point(xValues[i], yValues[i], randomColor, 20);
        }
        return new COW7.Polygon(points, Color.BLACK);
    }
    
    public static boolean arePointsAccurate(COW7.Point[] thePoints, int[] xValues, int[] yValues){
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
