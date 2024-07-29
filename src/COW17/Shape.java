package COW17;

public class Shape
{
    protected double _base, _height;

    public Shape(double base, double height){
        _base = base;
        _height = height;
    }

    public double getArea(){
        return (_base * _height);
    }
}
