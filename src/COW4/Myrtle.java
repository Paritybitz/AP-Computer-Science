package COW4;

import COW4.Tests.Block;
import COW4.Tests.Turtle;

import javax.swing.*;

public class Myrtle extends Turtle {
    public Myrtle(JPanel world, Block[][] map, char direction, int row, int col, int fruitCount) {
        super(world, map, direction, row, col, fruitCount);
    }

    public void move(int numSteps) {
        for (int n = 1; n <= numSteps; n++) {
            move();
        }
    }

    public void moveToWall() {
        while (frontIsClear()) {
            move();
        }
    }

    public void moveToFruit() {
        while (frontIsClear()) {
            move();
            if (isNextToFruit())
                pickAllFruit();
        }
    }


    public void pickFruit(int numFruit) {
        for (int n = 1; n <= numFruit; n++) {
            pickFruit();
        }
    }

    public void pickAllFruit() {
        while (isNextToFruit()) {
            pickFruit();
        }
    }

    public void placeRow(int numSteps) {
        for (int steps = 1; steps <= numSteps; steps += 1) {
            move();
            placeFruit();
        }
    }

    public void findFruitInMaze() {
        moveToWall();
        turnLeft();
        moveToWall();
        turnLeft();
        moveToWall();
        turnRight();
        moveToWall();
        turnRight();
        moveToWall();
        turnLeft();
        move(1);
        turnRight();
        moveToWall();
        turnRight();
        moveToWall();
        turnRight();
        moveToWall();
        turnLeft();
        moveToWall();
        turnLeft();
        moveToWall();
        turnRight();
        moveToWall();
        turnLeft();
        move(3);
        turnLeft();
        moveToWall();
        turnRight();
        moveToWall();
        turnLeft();
        moveToWall();
        turnLeft();
        moveToWall();
        turnRight();
        moveToWall();
        turnRight();
        moveToWall();
        turnRight();
        moveToWall();
        turnLeft();
        moveToWall();
        pickFruit();
    }

}

