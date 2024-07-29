package COW3;

import java.awt.*;

public class Box {
    private int _x;
    private int _y;
    private Color _color;
    private int _width;
    private int _height;
    private  boolean _isOn;

    //constructor
    public Box(int x, int y, Color color, int width, int height)
    {
        _x = x;
        _y = y;
        _color = color;
        _width = width;
        _height = height;
        _isOn = false;
    }

    public int getX()
    {
        return(_x);
    }
    public int getY()
    {
        return(_y);
    }
    public int getWidth()
    {
        return(_width);
    }
    public int getHeight()
    {
        return(_height);
    }
    public boolean getIsOn()
    {
        return(_isOn);
    }

    public void turnOn()
    {
        _isOn = true;
    }

    public void turnOff()
    {
        _isOn = false;
    }

    public void toggle()
    {
    /*    if(_isOn == true)
            turnOff();
        else
            turnOn();*/

        _isOn =! _isOn;
    }

    public void paint(Graphics g) {
        Color color;

        if (_isOn == false)
            color = Color.BLACK;
        else
            color = _color;

        g.setColor(color);
        g.fillRect(_x, _y, _width, _height);

        //draw border
        g.setColor(Color.GRAY);
        ((Graphics2D)g).setStroke(new BasicStroke(5));
        g.drawRect(_x, _y, _width, _height);
    }

    public Color getColor() {
        return (_color);
    }

    public void moveRight(int amount)
    {
        _x += amount;
    }

    public void moveLeft(int amount)
    {
        _x -= amount;
    }

    public void moveUp(int amount)
    {
        _y -= amount;
    }

    public void moveDown(int amount)
    {
        _y += amount;
    }

    public void stretchRight(int amount)
    {
        _width += amount;
    }

    public void stretchDown(int amount)
    {
        _height += amount;
    }

    public void stretchLeft(int amount)
    {
        //move x to left, i.e. x-amt
        _x -= amount;

        //inc the width with amt factor
        _width += amount;
    }

    public void stretchUp(int amount)
    {
        _y += amount;
        _height += amount;
    }

    public void stretch(int amount)
    {
        stretchLeft(amount);
        stretchUp(amount);
        stretchRight(amount);
        stretchDown(amount);
    }

    public void moveTo(int nextX, int nextY)
    {
        _x = nextX;
        _y = nextY;
    }

    public boolean equals(Box otherBox)
    {
        return(this._width == otherBox.getWidth() && this._height == otherBox.getHeight());
    }

    public int getArea() {
        return(getWidth()  * getHeight());
    }

    public int compareTo(Box otherBox)
    {
        int areaA = this.getArea();
        int areaB = otherBox.getArea();

        if(areaA == areaB)
            return(0);
        else if(areaA < areaB)
            return(-1);
        else
            return(1);
    }

    public String toString() {
        String retVal = String.format("(%1$s,%2$s) (%3$sx%4$s)", _x, _y, _width,_height);
        return(retVal);
    }
}
