package COW8;

public class Looper
{
    public void countUp (Intake feed){
        for (int row = 1; row <= 10; row++){
            feed.give(row);

            for (int col = 1; col <= 10; col++){
                feed.give(col);
            }
        }
    }

    public void countUp (Intake feed, int numRows, int numCols){
        for (int row = 1; row <= numRows; row++){
            feed.give(row);

            for (int col = 1; col <= numCols; col++){
                feed.give(col);
            }
        }
    }

    public void countUp (Intake feed, int numRows ){
        for (int row = 1; row <= numRows; row++){
            feed.give(row);

            for (int col = 1; col <= row; col++) {
                feed.give(col);
            }
        }
    }

    public void countUpByRow (Intake feed, int numRows, int numValues ){
            for (int row = 1; row <= numRows; row++) {
                System.out.print(row);
                feed.give(row);

                for(int count = 1; count <= numValues*row; count+=row) {
                    System.out.print(count);
                    feed.give(count);
                }
            }
        }

    public void countUpToCeilingAndBack(Intake feed, int numRows, int ceiling) {
        boolean inc = true;

        for (int row = 1; row <= numRows; row++){
            feed.give(row);
            System.out.print(row);

            for (int num = 1; num > 0; ) {
                feed.give(num);
                System.out.print(num);

                if (num >= ceiling)
                    inc = false;

                if (inc)
                    num += row;
                else
                    num -= row;
            }

            inc = true;
            System.out.println("");
        }
    }

    public void fluctuateToCeiling(Intake feed, int numRows ){

    }
}