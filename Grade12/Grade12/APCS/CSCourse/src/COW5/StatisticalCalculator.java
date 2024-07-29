package COW5;

public class StatisticalCalculator
{
    public static double sumArray(double [] values){
        double sum = 0;

        for(int i = 0; i < values.length; i++)
            sum += values[i];

        return sum;
    }

    public static double getAverageValue(double [] values){
        double sum = sumArray(values);
        double avg = sum / values.length;

        return avg;
    }

    public static double getMedianValue(double [] values){
        double retval;
        int n;

        if(values.length % 2 == 0) {
            n  = values.length / 2;
            double a = values[n];
            double b = values[n - 1];
            retval = (a + b) / 2;
        }
        else {
            n = (int)Math.floor(values.length / 2);
            retval = values[n];
        }

        return retval;
    }

    public static double standardDeviation(double [] values){
        int populationSize = values.length;
        double mean = getAverageValue(values);
        double sum = 0;

        //SD = SQRT(SUM(Xi - u)^2/N)
        for (int i=0; i < values.length; i++) {
            sum += Math.pow(values[i] - mean, 2);
        }

        double sd = Math.sqrt(sum / populationSize);

        return sd;
    }

    public static double[] getDeviations(double [] values){
        double [] zScores = new double[values.length];
        double sd = standardDeviation(values);
        double avg = getAverageValue(values);

        for(int i = 0; i < values.length; i++) {
            zScores[i] = (values[i] - avg) / sd;
        }

        return zScores;
    }

    public static double getCorrelation(double [] xValues, double [] yValues){
        //https://www.cuemath.com/data/how-to-calculate-correlation-coefficient/

        double sumX = sumArray(xValues);
        double sumY = sumArray(yValues);

        double avgX = getAverageValue(xValues);
        double avgY = getAverageValue(yValues);

        double sdX = standardDeviation(xValues);
        double sdY = standardDeviation(yValues);

        double sum=0;
        for (int i=0; i < xValues.length; i++) {
            sum += (xValues[i] - avgX) * (yValues[i] - avgY);
        }

        double covariance = sum / xValues.length;
        double covarianceCoefficient = covariance / (sdX * sdY);

        return covarianceCoefficient;
    }
}