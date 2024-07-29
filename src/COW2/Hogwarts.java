package COW2;

public class Hogwarts
{
    public static boolean isCauldronAtCorrectTemp(double temp){
        return(temp == 200.23);
    }

    public static boolean isGoodProfessor(String teacherName) {
        return (teacherName == "Dumbledore"
                || teacherName == "Flitwick"
                || teacherName == "McGonagall"
                || teacherName == "Sprout"
                || teacherName == "Lupin"
                || teacherName == "Hagrid");
    }

    public static String whatHogwartsHouse(int dedication, int intelligence, int bravery, int ambition){
        if((bravery > dedication) && (bravery > ambition) && (bravery > intelligence))
            return ("Gryffindor");
        else if (((dedication > bravery) && (dedication > ambition) && (dedication > intelligence)))
            return ("Hufflepuff");
        else if (((ambition > bravery) && (ambition > dedication) && (ambition > intelligence)))
            return ("Slytherin");
        else
            return ("Ravenclaw");
    }

    public static String whatDoYouTurnInto(int doorNumber, String drinkColor) {
        if (doorNumber == 1) {
            if (drinkColor.equals("pink"))
                return ("Cat");
            else if (drinkColor.equals("green"))
                return ("Toad");
            else
                return ("Owl");
        }
        else if (doorNumber == 2) {
            if (drinkColor.equals("pink"))
                return ("Rat");
            else if (drinkColor.equals("green"))
                return ("Snake");
            else
                return ("Griffin");
        }
        else if (doorNumber == 3) {
            if (drinkColor.equals("pink"))
                return ("Unicorn");
            else if (drinkColor.equals("green"))
                return ("Dragon");
            else
                return ("Giant Squid");
        }
        else
            return ("");

    }

    public static String whereToApparate(boolean overseas, boolean onCoast, boolean inBigCity){
        if(overseas) {
            if (onCoast)
                return (inBigCity ? "Hong Kong" : "Nassua");
            else
                return (inBigCity ? "London" : "Lucerne");
        }
        else {
            if (onCoast)
                return (inBigCity ? "Los Angeles" : "Nags Head");
             else
                return (inBigCity ? "Chicago" : "Blacksburg");

        }
    }

    public static String whatToPrepare(String day, double timeOfDay, boolean isVegetarian)  {
        //breakfast
        if(timeOfDay < 11)
        {
            //on weekends
            if(day == "Saturday" || day == "Sunday")
                return(isVegetarian ? "waffles" : "biscuits with gravy");
            else    //on weekdays
                return ("cereal");
        }
        //lunch
        else {
            //on weekends
            if(day == "Saturday" || day == "Sunday")
                return(isVegetarian ? "salad" : "steak and potatoes");
            else    //on weekdays
                return(isVegetarian ? "beans with rice" : "chicken with rice");
        }
    }
}