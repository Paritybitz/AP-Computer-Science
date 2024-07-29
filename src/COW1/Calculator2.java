package COW1;

public class Calculator2 {
    public double calcVolOfRectPrism(double length, double width, double height) {
        return (length * width * height);
    }

    public double calcAreaOfTriangle(double base, double height) {
        return (1.0 / 2.0 * base * height);
    }

    public double calcFahrenheitToCelsius(double fahrenheitTemp) {
        return ((5.0 / 9.0) * (fahrenheitTemp - 32.0));
    }

    public double calcCelsiusToFahrenheit(double celciusTemp) {
        return ((9.0 / 5.0) * celciusTemp + 32.0);
    }

    public double calcSlope(double x1, double y1, double x2, double y2) {
        return ((y2 - y1) / (x2 - x1));
    }
}
