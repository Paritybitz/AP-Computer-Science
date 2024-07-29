package COW17.Testers;

import COW17.Shape;
import COW17.Trapezoid;
import COW17.Triangle;

public class ShapeTester
{
    public static void main(String[] args){
        System.out.println("Do shapes work: " + testShapes());
    }
    
    public static boolean testShapes(){
        boolean success = true;
        
        Shape shape1 = new Shape(13, 6);
        Shape shape2 = new Shape(8, 12);
        if(shape1.getArea() != 78 || shape2.getArea() != 96){
            success = false;
            System.out.println("Shape is not working");
        }
        
        Shape shape3 = new Triangle(13, 6);
        Shape shape4 = new Triangle(8, 12);
        if(shape3.getArea() != 39 || shape4.getArea() != 48){
            success = false;
            System.out.println("Triangle is not working");
        }
        
        Shape shape5 = new Trapezoid(13, 6, 9);
        Shape shape6 = new Trapezoid(8, 12, 6);
        if(shape5.getArea() != 66 || shape6.getArea() != 84){
            success = false;
            System.out.println("Trapezoid is not working");
        }
        
        return success;
    }
}
