package COW12;

import java.util.Random;

public class RandomNumbers
{
    public static void random1() {
        for (int i = 0; i < 30; i++) {
            System.out.println((new Random()).nextInt(11));
            //System.out.println((int)(Math.random() * 11));
        }
    }

    public static void random2() {
        for (int i = 0; i < 30; i++) {
            System.out.println((new Random()).nextInt(101));
        }
    }

    public static void random3() {
        for (int i = 0; i < 30; i++) {
            System.out.println((new Random()).nextInt(101) + 10);
        }
    }

    public static void random4() {
        for (int i = 0; i < 30; i++) {
            System.out.println((new Random()).nextInt(567) + 12);
        }
    }

    public static void random5() {
        for (int i = 0; i < 30; i++) {
            System.out.println((int)(Math.random() * 130) - 142);
        }
    }

    public static void random6() {
        for (int i = 0; i < 30; i++) {
            System.out.println((int)(Math.random() * 713) - 300);
        }
    }

}