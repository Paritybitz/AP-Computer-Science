package COW5;

public class Main {
    public static void main(String[] args) {
        double [] x1s = {4, 1, 8, 11, 13, 10, 7, 5, 15, 1};
        double [] y1s = {3, 2, 10, 10, 12, 11, 7, 4, 17, 0};

        double x = StatisticalCalculator.getCorrelation(x1s, y1s);
    }
}