package COW15;

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Board {

    JPanel thePanel;

    Light[][] theLights;
    Color currentColor;

    /*
     * Level 1
     */

    public void allOn() {

        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < theLights[0].length; col++) {
                theLights[row][col].turnOn();
            }
        }
    }

    public void allOff() {

        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < theLights[0].length; col++) {
                theLights[row][col].turnOff();
            }
        }
    }

    public void random() {

        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < theLights[0].length; col++) {
                theLights[row][col].turnOn();
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);
                Color randomColor = new Color(red, green, blue);
                theLights[row][col].setColor(randomColor);
            }
        }
    }

    public void drawHorizontalLine(int x, int y, int dis) {
        int row = y;

        for (int col = x; col <= x + dis; col++) {
            theLights[row][col].turnOn();
            theLights[row][col].setColor(Color.BLUE);
        }

    }

    public void drawVerticalLine(int x, int y, int dis) {
        int col = x;

        for (int row = y; row <= y + dis; row++) {
            theLights[row][col].turnOn();
            theLights[row][col].setColor(Color.BLUE);
        }

    }

    /*
     * Level 2
     */

    public void drawRightDiagonal(int x, int y, int dis) {
        int row = y;
        int col = x;

        for (int i = 0; i < dis; i++) {
            theLights[row][col].turnOn();
            theLights[row][col].setColor(Color.BLUE);
            row++;
            col++;
        }
    }

    public void drawLeftDiagonal(int x, int y, int dis) {
        int row = y;
        int col = x;

        for (int i = 0; i < dis; i++) {
            theLights[row][col].turnOn();
            theLights[row][col].setColor(Color.BLUE);
            row++;
            col--;
        }

    }

    public void drawRainbowLines() {
        int numColors = 1;
        for (int row = 0; row < theLights.length; row++) {
            double colorRatio = (double) row / theLights.length;
            for (int col = 0; col < theLights[0].length; col++) {
                Color color = Color.getHSBColor((float) (colorRatio * numColors), 1.0f, 1.0f);
                theLights[row][col].setColor(color);
            }
        }
        allOn();

    }

    public void lighten() {
        int maxValue = 255;

        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < theLights[0].length; col++) {
                Color currentColor = theLights[row][col].getColor();

                int newRed = currentColor.getRed() + 10;
                int newGreen = currentColor.getGreen() + 10;
                int newBlue = currentColor.getBlue() + 10;

                newRed = Math.min(newRed, maxValue);
                newGreen = Math.min(newGreen, maxValue);
                newBlue = Math.min(newBlue, maxValue);

                theLights[row][col].setColor(new Color(newRed, newGreen, newBlue));
            }
        }
    }

    public void darken() {
        int maxValue = 255;

        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < theLights[0].length; col++) {
                Color currentColor = theLights[row][col].getColor();

                int newRed = currentColor.getRed() - 10;
                int newGreen = currentColor.getGreen() - 10;
                int newBlue = currentColor.getBlue() - 10;

                newRed = Math.min(newRed, maxValue);
                newGreen = Math.min(newGreen, maxValue);
                newBlue = Math.min(newBlue, maxValue);

                theLights[row][col].setColor(new Color(newRed, newGreen, newBlue));
            }
        }
    }

    public void drawInitials() {
        // Draw the "A"
        drawVerticalLine(20, 10, 6);
        drawHorizontalLine(21, 10, 3);
        drawHorizontalLine(21, 13, 3);
        drawVerticalLine(25, 10, 6);

        // Draw the "M"
        drawVerticalLine(30, 10, 6);
        drawHorizontalLine(31, 10, 2);
        drawHorizontalLine(33, 11, 1);
        drawHorizontalLine(34, 12, 1);
        drawHorizontalLine(35, 11, 1);
        drawHorizontalLine(36, 10, 2);
        drawVerticalLine(38, 10, 6);
    }

    /*
     * Level 3
     */

    public void drawRect(int x, int y, int width, int height) {
        drawHorizontalLine(x, y, width);
        drawHorizontalLine(x, y + height, width);
        drawVerticalLine(x, y, height);
        drawVerticalLine(x + width, y, height);

    }

    public void fillRect(int x, int y, int width, int height) {
        for (int row = y; row < y + height; row++) {
            for (int col = x; col < x + width; col++) {
                theLights[row][col].turnOn();
                theLights[row][col].setColor(Color.BLUE);
            }
        }
    }

    public void negative() {
        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < theLights[0].length; col++) {
                Color currentColor = theLights[row][col].getColor();
                int red = 255 - currentColor.getRed();
                int green = 255 - currentColor.getGreen();
                int blue = 255 - currentColor.getBlue();
                Color negativeColor = new Color(red, green, blue);
                theLights[row][col].setColor(negativeColor);
            }
        }
    }

    public void shiftRight() {
        Light temp = theLights[0][theLights[0].length - 1];

        for (int row = 0; row < theLights.length; row++) {
            for (int col = theLights[0].length - 1; col > 0; col--) {
                theLights[row][col] = theLights[row][col - 1];
            }

            theLights[row][0] = temp;
            temp = theLights[row][theLights[0].length - 1];
        }
    }

    public void shiftLeft() {
        Light[] leftmostColumn = new Light[theLights.length];
        for (int row = 0; row < theLights.length; row++) {
            leftmostColumn[row] = theLights[row][0];
        }

        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < theLights[0].length - 1; col++) {
                theLights[row][col] = theLights[row][col + 1];
            }
        }

        for (int row = 0; row < theLights.length; row++) {
            theLights[row][theLights[0].length - 1] = leftmostColumn[row];
        }
    }

    public void shiftUp() {
        Light[] topRow = theLights[0];

        for (int row = 1; row < theLights.length; row++) {
            theLights[row - 1] = theLights[row];
        }

        theLights[theLights.length - 1] = topRow;
    }

    public void shiftDown() {
        Light[] bottomRow = theLights[theLights.length - 1];

        for (int row = theLights.length - 1; row > 0; row--) {
            theLights[row] = theLights[row - 1];
        }

        theLights[0] = bottomRow;
    }

    /*
     * Level 4
     */

    public void flipHorizontally() {
        int width = theLights[0].length;
        for (int row = 0; row < theLights.length; row++) {
            for (int col = 0; col < width / 2; col++) {
                Light temp = theLights[row][col];
                theLights[row][col] = theLights[row][width - col - 1];
                theLights[row][width - col - 1] = temp;
            }
        }
    }

    public void flipVertically() {
        int rows = theLights.length;
        int cols = theLights[0].length;
        for (int row = 0; row < rows / 2; row++) {
            for (int col = 0; col < cols; col++) {
                Light temp = theLights[row][col];
                theLights[row][col] = theLights[rows - row - 1][col];
                theLights[rows - row - 1][col] = temp;
            }
        }
    }

    public void rotate() {
        int numRows = theLights.length;
        int numCols = theLights[0].length;

        Light[][] rotatedLights = new Light[numCols][numRows];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                rotatedLights[col][numRows - 1 - row] = theLights[row][col];
            }
        }

        theLights = rotatedLights;
    }

    /*
     * Level 5
     */

    public void fillOval(int x, int y, int width, int height) {

    }


    public void drawLandScape() {
        drawRect(50, 50, 5, 5);
        drawRightDiagonal(53, 47, 3);
        drawLeftDiagonal(53, 47, 3);

        drawRect(70, 30, 10, 10);

        for (int row = 30; row < 40; row++) {
            for (int col = 70; col < 80; col++) {
                theLights[row][col].turnOn();
                theLights[row][col].setColor(Color.YELLOW);
            }
        }

    }

    /*
     * LiteBright Part 2
     */
    public void printChar(char letter, int x, int y) {

    }

    public void printText(String text) {

    }

    public void areaFill(Color theColor, int x, int y) {


    }

    public void recurAreaFill(Color theColor, int r, int c, Color previousColor) {


    }

    public void drawDynamicLetter(char letter, int r, int c, int dimension, Color theColor, boolean bold) {
        //System.out.println(letter + ", " + r + ", " + c + ", " + dimension + ", " + theColor + ", " + bold);
    }

    public void printDynamicText(String text, int dimension, Color theColor, boolean bold) {
        //System.out.println(text + ", " + dimension + ", " + theColor + ", " + bold);
    }


    /*
     * Do Not Edit the Code Below
     */

    public static final int pixelSize = 7;

    public Board(JPanel aPanel) {
        theLights = new Light[100][100];
        for (int r = 0; r < theLights.length; r++) {
            for (int c = 0; c < theLights[0].length; c++) {
                theLights[r][c] = new Light();
            }
        }
        thePanel = aPanel;
        currentColor = Color.BLUE;
    }

    public void swap(int r1, int c1, int r2, int c2) {
        Light temp;
        temp = theLights[r1][c1];
        theLights[r1][c1] = theLights[r2][c2];
        theLights[r2][c2] = temp;
    }

    public void draw(Graphics g) {
        for (int r = 0; r < theLights.length; r++) {
            for (int c = 0; c < theLights[0].length; c++) {
                theLights[r][c].draw(g, c * (pixelSize + 1) + 1, r * (pixelSize + 1) + 1);
            }
        }
    }

    public void setColor(Color nextColor) {
        currentColor = nextColor;
        System.out.println(currentColor);
    }

    public void loadImage(String filename) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
            return;
        }

        //System.out.println("Height: " + img.getHeight());
        //System.out.println("Width: " + img.getWidth());

        int hPixelsRemaining = img.getHeight();
        int rLightsRemaining = theLights.length;

        int yStart = 0;
        for (int r = 0; r < theLights.length; r++) {
            int heightDiff = hPixelsRemaining / rLightsRemaining;

            int yEnd = yStart + heightDiff;

            int wPixelsRemaining = img.getWidth();
            int cLightsRemaining = theLights[0].length;

            int xStart = 0;
            for (int c = 0; c < theLights[0].length; c++) {
                //System.out.println("Placing " + r + ", " + c);

                int widthDiff = wPixelsRemaining / cLightsRemaining;

                int xEnd = xStart + widthDiff;

                //System.out.println("Height Step: " + heightDiff + " WidthStep: " + widthDiff);
                //System.out.println("wPixelsRemaining: " + wPixelsRemaining);
                //System.out.println("Pulling from " + xStart + ", " + yStart);

                double size = heightDiff * widthDiff;
                int red = 0;
                int green = 0;
                int blue = 0;
                //System.out.println("==========================================================");
                for (int x = xStart; x < xEnd; x++) {
                    for (int y = yStart; y < yEnd; y++) {
                        int color = img.getRGB(x, y);
                        Color nextColor = new Color(color);
                        //System.out.println("The int Color: " + color);
                        red += nextColor.getRed();
                        green += nextColor.getGreen();
                        blue += nextColor.getBlue();

                    }
                }

                red /= size;
                blue /= size;
                green /= size;
                //System.out.println("Red: " + red + " Blue: " + blue + " Green: " + green);
                theLights[r][c].setColor(new Color(red, green, blue));
                theLights[r][c].turnOn();

                cLightsRemaining--;
                wPixelsRemaining -= widthDiff;
                xStart = xEnd;
            }

            hPixelsRemaining -= heightDiff;
            rLightsRemaining--;
            yStart = yEnd;
        }
    }

}
