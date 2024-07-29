package COW2;

public class Grader {

    public boolean isItPassing(double percentGrade) {
        return(percentGrade >= 60);
    }

    public boolean isError(double percentGrade) {
        return(percentGrade > 100 || percentGrade < 0);
    }

    public String getLetter(double percentGrade) {
        if(percentGrade >= 90)
            return("A");
        else if(percentGrade >= 80 && percentGrade < 90)
            return("B");
        else if(percentGrade >= 70 && percentGrade < 80)
            return("C");
        else if(percentGrade >= 60 && percentGrade < 70)
            return("D");
        else
            return("F");
    }

    public String getModifier(double percentGrade) {
        if(percentGrade == 100)
            return ("+");
        else if(percentGrade >= 60)
        {
            String percentGradeStr = String.valueOf(percentGrade);
            char lastChar = percentGradeStr.charAt(percentGradeStr.indexOf('.') - 1);

            if (lastChar == '7' || lastChar == '8' || lastChar == '9')
                return("+");
            else if (lastChar == '0' || lastChar == '1' || lastChar == '2')
                return("-");
        }

        return("");
    }

    public double adjustForHonors(double percentGrade) {
        double adjustedScore = percentGrade + (percentGrade * 0.1);

        if (percentGrade >= 60)
            return(adjustedScore == 100 ? 100 : adjustedScore);
        else
            return(percentGrade);
    }

    public double adjustForCurve(double percentGrade) {
        double adjustedScore = (percentGrade - 100.0) * 0.75;

        return(adjustedScore);
    }

    public String giveLetterGrade(double percentGrade, boolean isHonors, boolean isPassFail, boolean isCurved){
        String finalGrade;

        if (isError(percentGrade))
            return("Error");

        if (isPassFail)
            return(isItPassing(percentGrade) ? "P" : "F");

        double modifiedGrade = percentGrade;
        modifiedGrade = (isCurved ? adjustForCurve(percentGrade) : percentGrade);
        modifiedGrade = (isHonors ? adjustForHonors(modifiedGrade) : modifiedGrade);
        String gradeLetter = getLetter(modifiedGrade);
        String gradeModifier = getModifier(modifiedGrade);
        finalGrade = gradeLetter.concat(gradeModifier);
        return finalGrade;
    }
}
