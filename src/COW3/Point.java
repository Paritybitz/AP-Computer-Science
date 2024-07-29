package COW3;

import java.awt.*;

public class Point {
    private int _x;
    private int _y;
    private Color _color;
    private int _radius;

    public Point(int x, int y, Color color, int size) {
        _x = x;
        _y = y;
        _color = color;
        _radius = size;
    }

    public int getX() {
        return (_x);
    }

    public int getY() {
        return (_y);
    }

    public Color getColor() {
        return (_color);
    }

    public int getRadius() {
        return (_radius);
    }

    public String toString() {
        String coordinates = String.format("(%1$s,%2$s)", _x, _y);
        return (coordinates);
    }

    public void print(Graphics g) {
        g.setColor(_color);
        g.drawOval(_x - _radius, _y - _radius, _radius * 2, _radius * 2);
    }

    public void moveRight(int amount) {
        _x += amount;
    }

    public void moveLeft(int amount) {
        _x -= amount;
    }

    public void moveUp(int amount) {
        _y -= amount;
    }

    public void moveDown(int amount) {
        _y += amount;
    }

    public double getDistance(Point otherPoint) {
        double retVal = Math.sqrt(Math.pow(_x - otherPoint.getX(), 2) +  Math.pow(_y - otherPoint.getY(), 2));
        return retVal;
    }

    public void moveTo(int nextX, int nextY) {
        _x = nextX;
        _y = nextY;
    }

    public boolean equals(Point otherPoint) {
        return (this._x == otherPoint.getX() && this._y == otherPoint.getY());
    }

    public int compareTo(Point otherPoint) {
        //create origin point; just x and y matters
        Point origin = new Point(0, 0, Color.BLUE,1);

        double distanceA = this.getDistance(origin);
        double distanceB = otherPoint.getDistance(origin);

        if(distanceA == distanceB)
            return 0;
        else if(distanceA < distanceB)
            return -1;
        else
            return 1;
    }
}