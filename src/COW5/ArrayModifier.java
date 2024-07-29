package COW5;

public class ArrayModifier
{
    public static double[] flip(double [] data){
        double [] flipped = new double[data.length];

        for (int i = 0; i < data.length; i++)
            flipped[i] = data[i] * (-1);

        return flipped;
    }

    public static double[] amplify(double [] data, double multiplier){
        double [] amplified = new double[data.length];

        for (int i = 0; i < data.length; i++)
            amplified[i] = data[i] * multiplier;

        return amplified;
    }

    public static double[] cap(double [] data, int min, int max){
        double [] capped = new double[data.length];

        for (int i = 0; i < data.length; i++) {
            if(data[i] > min && data[i] < max)
                capped[i] = data[i];
            else if(data[i] < min)
                capped[i] = min;
            else
                capped[i] = max;
        }

        return capped;
    }

    public static double[] averageElements(double [] data1, double [] data2){
        double [] averagedElements = new double[data1.length];

        for (int i = 0; i < data1.length; i++){
            averagedElements [i] = (data1[i] + data2[i])/2; //find average of each 'i'th value from each array
        }

        return averagedElements;
    }

    public static double[] evenOut(double [] data){
        double [] evenedOut = new double[data.length];

        return evenedOut;
    }

    public static double[] compress(double [] data){
        int counter=0;
        double retVal[] = new double[Math.round(data.length/2)];

        if (data.length % 2 == 0)
        {
            for(int i=0; i < data.length; i+=2, counter++) {
                retVal[counter] = (data[i] + data[i+1]) / 2;
            }
        }
        else {
            for(int i=0; i < data.length; counter++) {
                if (i == data.length - 3) {
                    retVal[counter] = (data[i] + data[i + 1] + data[i + 2]) / 3;
                    i += 3;
                }
                else{
                    retVal[counter] = (data[i] + data[i+1]) / 2;
                    i += 2;
                }
            }
        }

        return retVal;
    }
}