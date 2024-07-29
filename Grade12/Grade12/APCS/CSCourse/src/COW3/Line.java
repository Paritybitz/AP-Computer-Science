package COW3;

import java.awt.*;

public class Line {
    private Point _endPoint1;
    private Point _endPoint2;

    public Line(Point endPoint1, Point endPoint2) {
        _endPoint1 = endPoint1;
        _endPoint2 = endPoint2;
    }

    public Point getEndpoint1() {
        return _endPoint1;
    }

    public Point getEndpoint2() {
        return _endPoint2;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow((_endPoint2.getX() - _endPoint1.getX()), 2) + (Math.pow((_endPoint2.getY() - _endPoint1.getY()), 2)));
    }

    public Point getMidPoint() {
        int midX = ((_endPoint1.getX() + _endPoint2.getX()) / 2);
        int midY = ((_endPoint1.getY() + _endPoint2.getY()) / 2);
        Point midPoint = new Point(midX, midY, _endPoint2.getColor(), _endPoint2.getRadius());
        return midPoint;
    }

    public void moveRight(int amount) {
        _endPoint1.moveRight(amount);
        _endPoint2.moveRight(amount);
    }

    public void moveLeft(int amount) {
        _endPoint1.moveLeft(amount);
        _endPoint2.moveLeft(amount);
    }

    public void moveUp(int amount) {
        _endPoint1.moveUp(amount);
        _endPoint2.moveUp(amount);
    }

    public void moveDown(int amount) {
        _endPoint1.moveDown(amount);
        _endPoint2.moveDown(amount);
    }

    public boolean equals(Line otherLine) {
        if ((_endPoint1 == otherLine.getEndpoint1()) && (_endPoint2 == otherLine.getEndpoint2())) {
            return true;
        } else if ((_endPoint1 == otherLine.getEndpoint2()) && (_endPoint2 == otherLine.getEndpoint1())) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Line otherLine) {
        int num = 100;
        if (otherLine.getDistance() < getDistance()) {
            num = 1;
            return num;
        } else if (otherLine.getDistance() > getDistance()) {
            num = -1;
            return num;
        } else {
            num = 0;
            return num;
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(_endPoint1.getX(), _endPoint1.getY(), _endPoint2.getX(), _endPoint2.getY());
    }
}