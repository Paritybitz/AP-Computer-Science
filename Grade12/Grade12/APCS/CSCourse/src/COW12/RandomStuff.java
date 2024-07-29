package COW12;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomStuff
{
    private static char[] lowercaseLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static char[] uppercaseLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '.', ',', '?', '/', ';', ':'};
    private static char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static String[] names = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Iris", "Jack"};

    public static char randomLowerCaseLetter() {
        int index = (int)(Math.random() * lowercaseLetters.length);
        return lowercaseLetters[index];
    }

    public static char randomUpperCaseLetter() {
        int index = (int)(Math.random() * uppercaseLetters.length);
        return uppercaseLetters[index];
    }

    public static char randomSpecialCharacter() {
        int index = (int)(Math.random() * specialCharacters.length);
        return specialCharacters[index];
    }

    public static char randomNumberCharacter() {
        int index = (int)(Math.random() * numbers.length);
        return numbers[index];
    }

    public static char randomLetter() {
        double rand = Math.random();

        if (rand < 0.25) {
            return randomLowerCaseLetter();
        } else if (rand < 0.5) {
            return randomUpperCaseLetter();
        } else if (rand < 0.75) {
            return randomSpecialCharacter();
        } else {
            return randomNumberCharacter();
        }
    }

    public static String randomName() {
        int index = (int)(Math.random() * names.length);
        return names[index];
    }

    public static String randomString() {
        return randomString(3);
    }

    public static String randomString(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += randomLowerCaseLetter();
        }
        System.out.println(str);
        return str;
    }

    public static String randomStringNumber(int n) {
        String str = "";
        double rand = Math.random();

        if (rand < 0.5) {
            str += "-";
        }
        int firstNumber = (int)(Math.random() * 9) + 1;
        str += firstNumber;
        for (int i = 0; i < n-1; i++) {
            str += randomNumberCharacter();
        }
        System.out.println(str);
        return str;
    }
}