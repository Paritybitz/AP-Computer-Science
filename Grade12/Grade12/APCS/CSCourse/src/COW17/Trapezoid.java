package COW17;

public class Trapezoid extends Shape
{
    protected double _base2;

    public Trapezoid(double base1, double height, double base2) {
        //init parent class
        super(base1, height);

        _base2 = base2;
    }

    public double getArea() {
        //return (((super._base + this._base2) / 2) * super._height);
        return (((_base + _base2) / 2) * _height);
    }
}
