package COW8;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Myrtle extends Turtle {
    public Myrtle(JPanel world, Block[][] map, char direction, int row, int col, int appleCount, int orangeCount, int lemonCount) {
        super(world, map, direction, row, col, appleCount, orangeCount, lemonCount);

    }

    public void pickRowOfApples(int numSteps) {
        for (int step = 0; step < numSteps; step++) {
            move();

            while (isNextToApple()) {
                pickApple();
            }
        }
    }

    public void pickRowOfFruit(int numSteps) {
        for (int step = 0; step < numSteps; step++) {
            move();

            while (isNextToApple()) {
                pickApple();
            }

            while (isNextToLemon()) {
                pickLemon();
            }

            while (isNextToOrange()) {
                pickOrange();
            }
        }
    }

    public void pickApplesToWall(int numApples) {
        do {
            move();

            for (int apple = 0; apple < numApples; apple++) {
                if (hasApples()) {
                    pickApple();
                }
            }

        } while (frontIsClear());
    }

    public void pickFruitToWall(int numApples, int numOranges, int numLemons) {
        do {
            move();

            for (int apple = 0; apple < numApples; apple++) {
                if (isNextToApple()) {
                    pickApple();
                }
            }

            for (int orange = 0; orange < numOranges; orange++) {
                if (isNextToOrange())
                    pickOrange();
            }

            for (int lemon = 0; lemon < numLemons; lemon++) {
                if (isNextToLemon())
                    pickLemon();
            }

        } while (frontIsClear());
    }

    public void harvestRowAndDeposit(int length) {
        for (int step = 0; step < length; step++) {
            move();

            while (isNextToApple()) {
                pickApple();
            }

            while (isNextToLemon()) {
                pickLemon();
            }

            while (isNextToOrange()) {
                pickOrange();
            }
        }

        turnLeft();
        turnLeft();

        for (int step = 0; step < length; step++)
            move();

        turnRight();
        turnRight();

        while (hasApples()) {
            placeApple();
        }

        while (hasLemons()) {
            placeLemon();
        }

        while (hasOranges()) {
            placeOrange();
        }
    }

    public void placeRowOfFruit(int length, int numApples, int numOranges, int numLemons) {
        for (int step = 0; step < length; step++) {
            move();

            for (int apple = 0; apple < numApples; apple++) {
                if (hasApples()) {
                    placeApple();
                }
            }

            for (int orange = 0; orange < numOranges; orange++) {
                if (hasOranges())
                    placeOrange();
            }

            for (int lemon = 0; lemon < numLemons; lemon++) {
                if (hasLemons())
                    placeLemon();
            }
        }
    }

    public void harvestAllAndDeposit(int width, int height) {

        for (int stepUp = 0; stepUp < height; stepUp++) {

            for (int step = 0; step < width; step++) {
                move();

                while (isNextToApple()) {
                    pickApple();
                }

                while (isNextToLemon()) {
                    pickLemon();
                }

                while (isNextToOrange()) {
                    pickOrange();
                }
            }

            turnLeft();
            turnLeft();

            for (int step = 0; step < width; step++)
                move();

            turnRight();
            turnRight();

            while (hasApples()) {
                placeApple();
            }

            while (hasLemons()) {
                placeLemon();
            }

            while (hasOranges()) {
                placeOrange();
            }
            turnLeft();
            move();
            turnRight();
        }
    }


    public void placeGrid(int width, int height, int numApples, int numOranges, int numLemons) {

        for (int stepUp = 0; stepUp < height; stepUp++) {

            for (int step = 0; step < width; step++) {
                move();

                for (int apple = 0; apple < numApples; apple++) {
                    if (hasApples()) {
                        placeApple();
                    }
                }

                for (int orange = 0; orange < numOranges; orange++) {
                    if (hasOranges())
                        placeOrange();
                }

                for (int lemon = 0; lemon < numLemons; lemon++) {
                    if (hasLemons())
                        placeLemon();
                }
            }
            turnLeft();
            turnLeft();

            for (int step = 0; step < width; step++)
                move();

            turnRight();
            move();
            turnRight();
        }
    }

    public void searchForFruit() {
        int height = 12;
        int level=0;
        char direction;

        boolean keepGoing = true;
        direction = 'E';

        do {
            if ((level == height && !frontIsClear()) || isNextToFruit())
                keepGoing = false;
            else {
                if (frontIsClear())
                    move();
                else {
                    if (direction == 'E') {
                        turnLeft();
                        move();
                        turnLeft();
                        direction = 'W';
                        level++;
                    } else if (direction == 'W') {
                        turnRight();
                        move();
                        turnRight();
                        direction = 'E';
                        level++;
                    }
                }
            }
        } while(keepGoing);
    }


    public void placeSpiral(int numSides) {
    }

    public void placePyramid(int sideLength) {

    }

    public void fillMazeWithFruits() {

    }

    public boolean isNextToFruit()
    {
        return isNextToApple() || isNextToOrange() || isNextToLemon();
    }
}