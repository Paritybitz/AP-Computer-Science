package COW7;


import java.awt.*;


public class Polygon{
    Point [] _points;
    Color _color;

    public Polygon(Point [] thePoints, Color theColor){
        _points = thePoints;
        _color = theColor;
    }

    public Point[] getPoints(){
        return _points;
    }

    public void paint(Graphics g){
        Point prevPoint = null;

        for (Point currPoint : _points) {
            if (prevPoint == null) {
                prevPoint = currPoint;
            }
            else {
                g.drawLine((int)prevPoint.getX(), (int)prevPoint.getY(), (int)currPoint.getX(), (int)currPoint.getY());
                prevPoint = currPoint;
            }
        }
    }
    
    public void moveRight(int amount){
        for (Point p : _points) {
            p.moveRight(amount);
        }
    }

    public void moveLeft(int amount){
        for (Point p : _points) {
            p.moveLeft(amount);
        }
    }

    public void moveUp(int amount){
        for (Point p : _points) {
            p.moveUp(amount);
        }
    }

    public void moveDown(int amount){
        for (Point p : _points) {
            p.moveDown(amount);
        }
    }

    public double getPerimeter(){
        double perimeter = 0;
        Point prevPoint = null;

        for (Point currPoint : _points) {
            //if we are starting
            if (prevPoint == null) {
                prevPoint = currPoint;
            }
            else {
                perimeter += getDistance(prevPoint, currPoint);
                prevPoint = currPoint;
            }
        }

        //get distance between first and last points
        perimeter += getDistance(_points[0], _points[_points.length-1]);

        return perimeter;
    }
    
    public void reflectAcrossX(int x) {
        for (Point point : _points) {
            double newX = (x - point.getX()) + x;
            point.setX(newX);
        }
    }

    public void reflectAcrossY(int y){
        for (Point point : _points) {
            double newY = (y - point.getY()) + y;
            point.setY(newY);
        }
    }

    public void reflectAcrossYequalX(){
        for (Point point : _points) {
            double newX = point.getY();
            double newY = point.getX();

            point.setX(newX);
            point.setY(newY);
        }
    }

    public void stretchHorizontally(double amount){
        for (Point point : _points){
            double newX = point.getX() * amount;
            point.setX(newX);
        }
    }

    public void stretchVertically(double amount){
        for (Point point : _points){
            double newY = point.getY() * amount;
            point.setY(newY);
        }
    }

    public void dilate(int x, int y, double multiplier){
        Point p1 = new Point(x, y,  Color.GREEN, 0);

        //dilation formula https://www.ixl.com/math/lessons/dilations
        //(x,y) ↦ (k(x–a)+a, k(y–b)+b)

        for (Point p : _points) {
            //get new dilated coordinates
            double x1 = multiplier * (p.getX() - x) + x;
            double y1 = multiplier * (p.getY() - y) + y;

            p.setX(x1);
            p.setY(y1);
        }
    }

    public void rotate(int x, int y, double angle){
    }

    public double getDistance(Point p1, Point p2) {
        double retVal = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));

        return retVal;
    }
}