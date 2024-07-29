package COW1;

import static java.lang.Math.tan;

public class Calculator5 {

    public double calcCompoundInterest(double initialDeposit, double interestRate, double numCompounded, double numYears) {
        /*
        A = P(1 + r/n)^nt
        A	=	final amount
        P	=	initial principal balance
        r	=	interest rate
        n	=	number of times interest applied per time period
        t	=	number of time periods elapsed
        */

        return(initialDeposit * Math.pow(1 + interestRate/numCompounded, numCompounded * numYears));
    }

    public double calcContinousCompoundInterest(double initialDeposit, double interestRate, double numYears ) {
        /*
        P * e^RT
        where:
        P = Intial deposit
        R = Interest rate
        T = Number of years
        e = Euler's number, value=2.71828
        * */

        return(initialDeposit * Math.exp(interestRate * numYears));
    }

    public double calcFirstRootOfQuadratic(double a, double b, double c) {
        double discriminant = Math.sqrt(Math.pow(b, 2) - (4 * a * c));

        return((-b + discriminant) / (2 * a));
    }

    public double calcHeight(double angleOfElevation, double distance) {
        /*
        * tan(a) = H/D
        * H = tan(a) * D
        * */

        //convert radians to degrees first, since Java trig functions take radian params
        return(Math.tan(Math.toRadians(angleOfElevation)) * distance);
    }

    public double calcAngleOfElevation(double height, double distance) {
        /*
         * tan(a) = H/D
         * a = atan(H/D)
         * */

        return(Math.toDegrees(Math.atan(height / distance)));
    }
}
