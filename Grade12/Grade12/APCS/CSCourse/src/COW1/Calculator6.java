package COW1;

public class Calculator6 {
    public double calcHalfLife(double startingAmount, double currentAmount, double elapsedTime) {
        /*
        Nt = N0 * (1/2)^t/λ
        N0=  initial quantity
        Nt = remaining or current quantity
        t is the time elasped
        λ is the half-life

        we need to solve for half-life

        λ = -t*ln(2) / ln(Nt/N0)
         */

        //return (-1 * elapsedTime * Math.log10()

        return ((-1 * elapsedTime * Math.log(2)) / (Math.log(currentAmount / startingAmount)));
    }

    public double calcStandardDeviation(double num1, double num2, double num3, double num4, double num5) {
        /*
        SD = SQRT(Sum Of Numerator / popSize )
        Numerator = (Vi - mean)^2
        Vi = each value
         */
        double avg = (num1 + num2 + num3 + num4 + num5) / 5;

        double numerator = Math.pow(num1 - avg, 2) +
                           Math.pow(num2 - avg, 2) +
                           Math.pow(num3 - avg, 2) +
                           Math.pow(num4 - avg, 2) +
                           Math.pow(num5 - avg, 2);

        double populationSize = 5;

        return(Math.sqrt(numerator / populationSize));
    }

    public double solveSystemOfEquations(double a1, double b1, double c1, double a2, double b2, double c2) {
        /*
        System of equations
        a1X + b1Y = c1
        a2X + b2Y = c2

        solve for X by elimination of Y, we get
        X = (b2c1 - b1c2) / (b2a1 - b1a2)
         */

        return ((b2*c1 - b1*c2) / (b2*a1 - b1*a2));
    }

    public double calcPyramidSurfaceArea(double height, double sideLength, double numSides) {
        /*
        SurfaceArea = Base area of COW7.Polygon + Lateral area of each triangle

        Base area of COW7.Polygon = 1/2.P.a
            where P = peimeter
                  a =  apothem     (https://www.mathopenref.com/apothem.html)
                    = s / (2tan(180/n))
        Laterl area = area of each triangle
           i.e.,  (H*L / 2) * numSides
         */

        double apothem = 0.5 * (sideLength / Math.tan(Math.toRadians(180 / numSides)));

        // c^2 = a^2 + b^2
        // => c = sqrt(a^2 + b^2)
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(apothem, 2));

        double perimeter = sideLength * numSides * slantHeight;

        //base area
        double areaOfPolygon = 0.5 * perimeter;

        double lateralArea = ((apothem * sideLength) / 2) * numSides;

        double area = areaOfPolygon + lateralArea;

        return (area);
    }

    public double calcPyramidVolume(double height, double sideLength, double numSides) {
        /*
        volume = (n/12) * height * sidelength² * cot(π/n)
        where n is number of sides of the base for regular polygon
        */

        double apothem = 0.5 * (sideLength / Math.tan(Math.toRadians(180 / numSides)));
        double area = (apothem * numSides * sideLength) / 2;
        double volume = (1.0/3.0) * area * height;

        return (volume);
    }

}

