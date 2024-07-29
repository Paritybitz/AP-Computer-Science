package COW1;

public class Calculator4 {

    public double calcLengthOfRadius(double areaOfCircle) {
        return(Math.sqrt(areaOfCircle/ Math.PI));
    }

    public double calcResistanceInParallel(double resister1, double resister2) {
        //Rtotal = R1R2 / (R1 + R2)
        return((resister1 * resister2) / (resister1 + resister2));
    }

    public double calcDistance(double x1, double y1, double x2, double y2) {
        //d=√((x2 – x1)² + (y2 – y1)²)
        return(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public double calcIntercept(double x1, double y1, double x2, double y2) {
        //shortcut 1
        //double slope = (new Calculator2()).calcSlope(x1, y1, x2, y2);

        //method 2
        //Calculator2 c2 = new Calculator2();
        //double slope  = c2.calcSlope(x1, y1, x2, y2);

        //y = mx + b
        double slope = (y2 - y1) / (x2 - x1);
        return (y1 - (slope * x1));
    }
    public double calcSurfaceAreaOfCone(double height, double radius) {
        //A = πr(r + sqrt(h^2 + r^2))
        return (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
    }
}
