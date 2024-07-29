package COW1;

public class Calculator3 {

    public double calcDifference(double x1, double x2) {
        return(Math.abs(x1 - x2));
    }

    public double calcAreaOfCircle(double lengthOfRadius) {
        return(Math.PI * Math.pow(lengthOfRadius, 2));
    }

    public double calcVolOfSphere(double lengthOfRadius) {
        return((4.0 / 3.0) * Math.PI * Math.pow(lengthOfRadius, 3));
    }

    public double calcGravity(double mass1, double mass2, double radius) {
        final double gravitationalConstant = 6.67408E-11;

        // gravitational force formula
        // = (G * M1 * M2) / r^2
        return((gravitationalConstant * mass1 * mass2) / Math.pow(radius, 2));
    }

    public double calcVolumeOfCone(double height, double radius) {

        // formula = (π * r^2 * h) / 3
        return ((Math.PI * Math.pow(radius, 2) * height) / 3);
    }
}
