package COW12.Utils;

import java.sql.PreparedStatement;

public class Wheel
{
    private int result;

    public Wheel(){
        result = 0;
    }

    public int spin(){
        int randomNum = (int)(Math.random() * 37) + 1;
        return randomNum;
    }

    public boolean isEven(){
        return result == 0 ? false : result % 2 == 0;
    }

    public boolean isOdd(){
        return result == 0 ? false : result % 2 == 1;
    }

    public int whichThird() {
        if (result == 0) {
            return 0;
        }
        else if (result >= 1 && result <= 12) {
            return 1;
        }
        else if (result >= 13 && result <= 24) {
            return 2;
        }
        else
            return 3;

    }

    public int getResult(){
        return result;
    }
}