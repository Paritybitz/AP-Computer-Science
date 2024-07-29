package COW17;

public class Triangle extends Shape
{

    public Triangle(double base, double height){
        super(base, height);
    }

    public double getArea(){
        return (_base * _height * 0.5);
    }
}
