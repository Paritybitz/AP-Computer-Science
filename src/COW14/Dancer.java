package COW14;

import java.util.Arrays;

public class Dancer
{
    private double[] scores;
    
    public Dancer(double[] scores){
        this.scores = scores;
    }
    
    public double[] getScores(){
        return scores;
    }

    private double getAverageScore(double[] scores) {
        double minScore = scores[0];
        double maxScore = scores[0];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            if (score < minScore) {
                minScore = score;
            }
            if (score > maxScore) {
                maxScore = score;
            }
            sum += score;
        }
        sum = sum - minScore - maxScore;
        int numScores = scores.length - 2;
        double average = sum / numScores;
        return average;
    }

    public int compareTo(Dancer other){
        double thisAverage = getAverageScore(scores);
        double otherAverage = getAverageScore(other.getScores());

        if (thisAverage > otherAverage) {
            return 1;
        } else if (thisAverage < otherAverage) {
            return -1;
        } else {
            return 0;
        }
    }
}