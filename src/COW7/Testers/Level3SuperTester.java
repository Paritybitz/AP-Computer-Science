package COW7.Testers;

import COW7.Point;

import java.awt.*;

public class Level3SuperTester
{
    public static boolean testLevel3(){
                int[] xValues = {200, 600, 600, 400, 400, 0};
            int[] yValues = {200, 200, 600, 800, 400, 400};
        boolean success = true;
        COW7.Polygon thePolygon;
        COW7.Point[] adjustedPoints;
        
        Point one = new COW7.Point(300, 400, Color.RED, 20);
        COW7.Point two = new COW7.Point(284, 482, new Color(10, 110, 234), 87);
        one.setX(20);
        one.setY(800);
        two.setX(8373);
        two.setY(23874);
        
        if(one.getX() != 20 || two.getX() != 8373){
            System.out.println("setX not working");
            success = false;
        }
        
        if(one.getY() != 800 || two.getY() != 23874){
            System.out.println("setY not working");
            success = false;
        }
        
        thePolygon = generatePolygon(xValues, yValues);
        if(Math.abs(thePolygon.getPerimeter() - 2165.685424949) > .1){
            System.out.println("getPerimeter not working, perimeter returned: " + thePolygon.getPerimeter());
            success = false;
        }
        
        
        return success;
    }
    
    
    
    public static COW7.Polygon generatePolygon(int[] xValues, int[] yValues){
        COW7.Point[] points = new COW7.Point[xValues.length];
        for(int i = 0; i < points.length; i++){
            int red = (int)(256 * Math.random());
            int green = (int)(256 * Math.random());
            int blue = (int)(256 * Math.random());
            Color randomColor = new Color(red, green, blue);
            points[i] = new COW7.Point(xValues[i], yValues[i], randomColor, 20);
        }
        return new COW7.Polygon(points, Color.BLACK);
    }
    
    
}
