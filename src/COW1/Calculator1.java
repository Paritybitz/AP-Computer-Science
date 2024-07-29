package COW1;

public class Calculator1 {
    public double calcAreaOfSquare(double length) {
        return (Math.pow(length, 2));
    }

    public double calcResistanceInSeries(double resister1, double resister2) {
        return (resister1 + resister2);
    }

    public double calcAreaOfRectangle(double length, double width) {
        return (length * width);
    }

    public double calcMilesPerHour(double miles, double hours) {
        return (miles / hours);
    }

    public double getProfit(double income, double expenses) {
        return (income - expenses);
    }
}
