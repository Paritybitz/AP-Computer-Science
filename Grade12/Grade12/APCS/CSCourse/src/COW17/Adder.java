package COW17;

public class Adder
{

    public static Object add(Object one, Object two) {

        if (one instanceof Character && two instanceof Character) {
            return String.format("%s%s", (Character) one, ((Character) two));
        }
        else if (one instanceof Integer && two instanceof Integer) {
            return (int) one + (int) two;
        }
        else if (one instanceof String && two instanceof String) {
            return String.format("%s %s", (String) one, ((String) two));
        }
        else {
            boolean bool1 = (boolean) one;
            boolean bool2 = (boolean) two;

            if (bool1 && !bool2 || !bool1 && bool2) {
                return true;
            } else {
                return false;
            }
        }
    }
}
