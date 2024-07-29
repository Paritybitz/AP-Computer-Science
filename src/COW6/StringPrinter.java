package COW6;

public class StringPrinter{
    //Level 1
    public static void printOutEachChar(String word){
        for (int i=0; i<word.length(); i++)
            System.out.println(String.format("Char %1$s: %2$s", i, word.charAt(i)));
    }

    //Level 2
    public static void printOutInReverse(String word){
        for (int i = word.length() - 1; i >= 0; i--)
            System.out.println(String.format("Char %1$s: %2$s", i+1, word.charAt(i)));
    }

    //Level 3
    public static void printTwoWords(String words){
        int wordCounter = 1;

        System.out.println("Word #" + wordCounter);

        for(int i = 0; i < words.length(); i++){
            if(words.charAt(i) == ' ') {
                wordCounter++;
                System.out.println("Word #" + wordCounter);
            }
            else
                System.out.println(String.format("Char %1$s: %2$s", i+1, words.charAt(i)));
        }

    }

    //Level 4
    public static void printOutBirthday(String birthday){
        String month = birthday.substring(0, birthday.indexOf(" "));
        String day = birthday.substring(birthday.indexOf(" ") + 1, birthday.indexOf(","));
        String year = birthday.substring(birthday.indexOf(",") + 2, birthday.length());

        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
    }

    //Level 5
    public static void printOutAddress(String address){
        String number = address.substring(0, address.indexOf(" "));
        String streetName = address.substring(address.indexOf(" ") + 1, address.indexOf(","));
        String county = address.substring(address.indexOf(", ")+2, address.lastIndexOf(", "));
        String state = address.substring(address.lastIndexOf(", ")+2, address.lastIndexOf(" "));
        String zipCode = address.substring(address.lastIndexOf(" ") + 1, address.length());

        System.out.println(String.format("Number: %1$s\n" +
                        "Street COW7.Name: %2$s\n" +
                        "County: %3$s\n" +
                        "State: %4$s\n" +
                        "Zip: %5$s"
                , number, streetName, county, state, zipCode));
    }

    //Level 6
    public static void printWords(String text){

    }
}