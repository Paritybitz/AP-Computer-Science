package COW7.Testers;

import COW7.Point;
import COW7.Polygon;

import java.awt.*;

public class Level6SuperTester
{
    
    public static boolean testLevel6(){
        int[] xValues = {200, 600, 600, 400, 400, 0};
        int[] yValues = {200, 200, 600, 800, 400, 400};
        boolean success = true;
        Polygon thePolygon, reversePolygon;
        COW7.Point[] adjustedPoints, adjustedReverse;
        
        thePolygon = generatePolygon(xValues, yValues);
        reversePolygon = generatePolygon(xValues, yValues);
        thePolygon.rotate(400, 400, 30);
        reversePolygon.rotate(400, 400, -30);
        adjustedPoints = thePolygon.getPoints();
        adjustedReverse = reversePolygon.getPoints();
        int[] xValuesRotate30 = {327, 673, 473, 201, 400, 54};
        int[] yValuesRotate30 = {127, 327, 673, 746, 400, 200};
        if(!arePointsAccurate(adjustedPoints, xValuesRotate30, yValuesRotate30) && !arePointsAccurate(adjustedReverse, xValuesRotate30, yValuesRotate30)){
            System.out.println("rotate 30 degrees not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        reversePolygon = generatePolygon(xValues, yValues);
        thePolygon.rotate(400, 400, 135);
        reversePolygon.rotate(400, 400, -135);
        adjustedPoints = thePolygon.getPoints();
        adjustedReverse = reversePolygon.getPoints();
        int[] xValuesRotate135 = {682, 400, 118, 118, 400, 682};
        int[] yValuesRotate135 = {400, 682, 400, 118, 400, 118}; 
        if(!arePointsAccurate(adjustedPoints, xValuesRotate135, yValuesRotate135) && !arePointsAccurate(adjustedReverse, xValuesRotate135, yValuesRotate135)){
            System.out.println("rotate 135 degrees not working");
            success = false;
        }
        
        return success;
    }
    
    
    
    public static COW7.Polygon generatePolygon(int[] xValues, int[] yValues){
        COW7.Point[] points = new Point[xValues.length];
        for(int i = 0; i < points.length; i++){
            int red = (int)(256 * Math.random());
            int green = (int)(256 * Math.random());
            int blue = (int)(256 * Math.random());
            Color randomColor = new Color(red, green, blue);
            points[i] = new Point(xValues[i], yValues[i], randomColor, 20);
        }
        return new Polygon(points, Color.BLACK);
    }
    
    public static boolean arePointsAccurate(COW7.Point[] thePoints, int[] xValues, int[] yValues){
        if(thePoints.length != xValues.length){
            return false;
        }
        for(int i = 0; i < xValues.length; i++){
            if(Math.abs(thePoints[i].getX() - xValues[i]) > 3){
                System.out.println("X values does not match");
                return false;
            }
            if(Math.abs(thePoints[i].getY() - yValues[i]) > 3){
                System.out.println("Y values does not match");
                return false;
            }
        }
        return true;
    }
}