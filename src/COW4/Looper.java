package COW4;

import COW4.Tests.Intake;

public class Looper {
    public void countUpTo10(Intake feed) {
        for (int n = 1; n <= 10; n++) {
            feed.give(n);
        }
    }

    public void countDownFrom10(Intake feed) {
        for (int n = 10; n >= 1; n--) {
            feed.give(n);
        }
    }

    public void countUpToX(Intake feed, int x) {
        int n = 1;
        while (n <= x) {
            feed.give(n);
            n++;
        }
    }

    public void countDownFromX(Intake feed, int x) {
        while (x >= 1) {
            feed.give(x);
            x--;
        }
    }

    public void countUpToXfromYbyA(Intake feed, int x, int y, int a) {
        for(int n=y; n<=x; n+=a) feed.give(n);
    }

    public void countDownFromXtoYbyA(Intake feed, int x, int y, int a) {
        while (y <= x) {
            feed.give(x);
            x -= a;
        }
    }

    public void runSequence1(Intake feed, int stop) {
        int i;

        for (i = 1; i <= stop; i = (i * 2) + 1) {
            feed.give(i);
        }
    }

    public void runSequence2(Intake feed, int stop) {
        int i;

        for (i = 1; i <= stop; i = (i * 2) + 2) {
            feed.give(i);
        }
    }

    public void runSequence4(Intake feed, int n) {
        int i;
        int state = 1;

        for (i = 1; i <= n; i++) {
            feed.give(state);
            state *= -1;
        }
    }

    public void runSequence5(Intake feed, int n) {
        int i;
        int state = 1;


        for (i = 1; i <= n; i++) {
            feed.give(state);
            state *= -10;
        }
    }

    public void runSequence7(Intake feed, int stop) {

        int i = 1;
        int inc = 1;
        int dir = 1;

        while (i <= stop) {
            feed.give(i);
            i += inc;

            if (inc == 4)
                dir = -1;
            else if (inc == 0)
                dir = 1;

            if (dir == 1)
                inc++;
            else
                inc--;
        }
    }

    public void runSequence8(Intake feed, int n) {
        int printCount = 0;

        for (int i = 1; i <= n && printCount < n; i++) {
            for (int j = 1; j <= i && printCount < n; j++) {
                feed.give(i);
                printCount++;
            }
        }
    }
}