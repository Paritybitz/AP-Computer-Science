package COW2;

public class Goldilocks
{
    public boolean doYouEnterHouse(boolean doorLocked){
        if(!doorLocked)
            return true;
        else
        return false;
        //could have also written this as:
        /*
        return !doorLocked;

        or

        return doorLocked == false;
         */
    }

    public boolean howsTheBed(int stiffness){
        if(stiffness == 0)
            return true;
        else
            return false;

        //could have also written this as:
        /*
        if(stiffness == 0){
            return true;
        }else{
            return false;
        }
         */
    }

    public boolean howsTheChair(String size){
        if (size == "Medium")
            return true;
        else
            return false;
    }

    public boolean howsThePorridge(double temperature){
        if(temperature >= 75 && temperature <= 99)
            return true;
        else
            return false;
    }

    public boolean howsEverything(double temperature, String size, int stiffness){
        if(!howsTheBed(stiffness)){
            return false;
        }else if(!howsTheChair(size)){
            return false;
        }else if(!howsThePorridge(temperature)){
            return false;
        }else{
            return true;
        }
        //could have also written this as:
        /*
        if(howsTheBed(stiffness) && howsTheChair(size) && howsThePorridge(temperature)){
            return true;
        }else{
            return false;
        }
         */
    }

    public int whichChairToSitIn(String size1, String size2, String size3){
        if(size1.equals("Medium")){
            return 1;
        }else if(size2.equals("Medium")){
            return 2;
        }else if(size3.equals("Medium")){
            return 3;
        }else if(size1.equals("Large")){
            return 1;
        }else if(size2.equals("Large")){
            return 2;
        }else if(size3.equals("Large")){
            return 3;
        }else{
            return -1;
        }
    }

    public int whichBedToSleepIn(int stiffness1, int stiffness2, int stiffness3){
        //checking for a perfect bed
        if(stiffness1 == 0){
            return 1;
        }else if(stiffness2 == 0){
            return 2;
        }else if(stiffness3 == 0){
            return 3;
            //after this no bed is perfect
            //checking if all beds are hard
        }else if(stiffness1 > 0 && stiffness2 > 0 && stiffness3 > 0){
            //checking which is closest to perfect
            if(stiffness1 <= stiffness2 && stiffness1 <= stiffness3){
                return 1;
            }else if(stiffness2 <= stiffness3){
                return 2;
            }else{
                return 3;
            }
            //checking if all beds are soft
        }else if(stiffness1 < 0 && stiffness2 < 0 && stiffness3 < 0){
            //checking which is closest to perfect
            if(stiffness1 >= stiffness2 && stiffness1 >= stiffness3){
                return 1;
            }else if(stiffness2 >= stiffness3){
                return 2;
            }else{
                return 3;
            }
            //after this, there is a mix of soft and hard beds
            //checking if there is only one soft bed
        }else if(stiffness1 < 0 && stiffness2 > 0 && stiffness3 > 0){
            return 1;
        }else if(stiffness2 < 0 && stiffness1 > 0 && stiffness3 > 0){
            return 2;
        }else if(stiffness3 < 0 && stiffness1 > 0 && stiffness2 > 0){
            return 3;
            //after this, there are two beds that are soft
        }else if(stiffness1 < 0 && stiffness2 < 0){
            //checking which is closest to perfect
            if(stiffness1 >= stiffness2){
                return 1;
            }else{
                return 2;
            }
        }else if(stiffness1 < 0 && stiffness3 < 0){
            //checking which is closest to perfect
            if(stiffness1 >= stiffness3){
                return 1;
            }else{
                return 3;
            }
        }else{
            //checking which is closest to perfect
            if(stiffness2 >= stiffness3){
                return 2;
            }else{
                return 3;
            }
        }
    }

    public int whichPorridgeToEat(double temp1, double temp2, double temp3){
        //checking if all three temps are in the acceptable range
        if(howsThePorridge(temp1) && howsThePorridge(temp2) && howsThePorridge(temp3)){
            //checking which one is closest to ideal
            if(Math.abs(90 - temp1) <= Math.abs(90 - temp2) && Math.abs(90 - temp1) <= Math.abs(90 - temp2)){
                return 1;
            }else if(Math.abs(90 - temp2) <= Math.abs(90 - temp1) && Math.abs(90 - temp2) <= Math.abs(90 - temp2)){
                return 2;
            }else{
                return 3;
            }
            //checking if at least two are in the acceptable range
            //checking if temp1 and temp2 are in the acceptable range
        }else if(howsThePorridge(temp1) && howsThePorridge(temp2)){
            //checking which one is closest to ideal
            if(Math.abs(90 - temp1) <= Math.abs(90 - temp2)){
                return 1;
            }else{
                return 2;
            }
            //checking if temp1 and temp3 are in the acceptable range
        }else if(howsThePorridge(temp1) && howsThePorridge(temp3)){
            //checking which one is closest to ideal
            if(Math.abs(90 - temp1) <= Math.abs(90 - temp3)){
                return 1;
            }else{
                return 3;
            }
            //checking if temp2 and temp3 are in the acceptable range
        }else if(howsThePorridge(temp2) && howsThePorridge(temp3)){
            //checking which one is closest to ideal
            if(Math.abs(90 - temp2) <= Math.abs(90 - temp3)){
                return 2;
            }else{
                return 3;
            }
            //checking if at least one is in the acceptable range
        }else if(howsThePorridge(temp1)){
            return 1;
        }else if(howsThePorridge(temp2)){
            return 2;
        }else if(howsThePorridge(temp3)){
            return 3;
        }else{
            return -1;
        }

    }


}
