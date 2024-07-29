package COW4;

import java.awt.*;
import java.util.*;

public class Painter {
    private static  int _inc = 10;

    public void paintVerticalLines(Graphics g) {
        System.out.println("Vertical Lines");
        int x = 0;

        while (x <= 400) {
            g.drawLine(x, 0, x, 400);
            x += 7;
        }
    }

    public void paintRedRange(Graphics g) {
        System.out.println("Red Range");
    }

    public void paintHourglass(Graphics g) {
        System.out.println("Hour glass");
    }

    public void paintLineGrid(Graphics g) {
        System.out.println("Line Grid");
        int y = 0;

        while (y <= 400) {
            g.drawLine(0, y, 400, y);
            y = y + 7;
        }
        //vertical
        int x = 0;

        while (x <= 400) {
            g.drawLine(x, 0, x, 400);
            x += 7;
        }
    }

    public void paintBullsEye(Graphics g) {
        System.out.println("BullsEye");
    }

    public void paintZoom(Graphics g) {
        System.out.println("Zoom");
    }

    public void paintHorizontalLines(Graphics g) {
        System.out.println("Horizontal Lines");

        int y = 0;

        while (y <= 400) {
            g.drawLine(0, y, 400, y);
            y = y + 7;
        }
    }

    public void paintRowOfBoxes(Graphics g) {
        System.out.println("Row of Boxes");
        int x = 10;

        while (x <= 700) {
            g.fillRect(x, 10, 35, 35);
            x += 50;
        }
    }


    public void paintPaperStack(Graphics g) {
        System.out.println("Paper Stack");

        int x = 5;
        int y = 5;

        while (x <= 300) {
            g.setColor(Color.WHITE);
            g.fillRect(x, y, 150, 400);
            g.setColor(Color.DARK_GRAY);
            g.drawRect(x, y, 150, 400);
            x += 10;
            y += 10;
        }
    }

    public void paintCornerWeb(Graphics g) {
        System.out.println("Corner Web");

        //horizontal
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 700;

        for(x1=0; x1<700;) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 10;
            y2 -= 10;
        }
    }

    public void paintXBox(Graphics g) {
        g.setColor(Color.WHITE);

        int x1 = 0;
        int y1 = 0;
        int x2 = 20;
        int y2 = 20;
        int d1 = 0;
        int d2 = 0;
        int d3 = 20;
        int d4 = 20;

        //border
        while (x1 <= 600) {
            g.fillRect(x1, y1, x2, y2);
            g.fillRect(x1, 600, x2, y2);
            x1 = x1 + 25;
        }

        //border
        while (y1 <= 600) {
            g.fillRect(x1 - 25, y1, x2, y2);
            g.fillRect(0, y1, 20, y2);
            y1 = y1 + 25;
        }

        //negative slope
        while (d1 <= 600 && d2 <= 600) {
            g.fillRect(d1, d2, d3, d4);
            d1 += 25;
            d2 += 25;
        }

        y1 = 600;

        for (x1 = 0; x1 < 600; x1 += 25) {
            g.fillRect(x1, y1, x2, y2);
            y1 -= 25;
        }
    }

    public void paintDreamCatcher(Graphics g) {
        System.out.println("Dream Catcher");

        int x1 = 0;
        int y1 = 350;
        int x2 = 350;
        int y2 = 350;

        while(x1 < 350) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 10;
            y2 -= 10;
        }

        x1 = 350;
        y1 = 350;
        x2 = 700;
        y2 = 350;

        while(y1 <= 700) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 10;
            x2 -= 10;
        }

        x1 = 350;
        y1 = 350;
        x2 = 700;
        y2 = 350;

        while(y1 >= 0){
            g.drawLine(x1, y1, x2, y2);
            y1-=10;
            x2-=10;
        }

        x1 = 0;
        y1 = 350;
        x2 = 350;
        y2 = 350;

        while(x1 < 350){
            g.drawLine(x1, y1, x2, y2);
            y2 += 10;
            x1 += 10;
        }

    }

    public void paintBowTie(Graphics g) {
        System.out.println("Bow Tie");

        int x1=0;
        int y1=700;
        int x2=233;
        int y2=400;
        while(y1>0){
            g.drawLine(x1, y1, x2, y2);
            y1-=10;
            y2-=2;
        }
        int x3=233;
        int y3=400;
        int x4=310;
        int y4=500;
        while(y3>260){
            g.drawLine(x3, y3, x4, y4);
            y3-=2;
            y4-=5;
        }
        int x5=310;
        int y5=500;
        int x6=389;
        int y6=500;
        while(y5>150){
            g.drawLine(x5, y5, x6, y6);
            y5-=5;
            y6-=5;
        }
        int x7=389;
        int y7=500;
        int x8=467;
        int y8=400;
        while(y8>260){
            g.drawLine(x7, y7, x8, y8);
            y7-=5;
            y8-=2;
        }
        int x9=467;
        int y9=400;
        int x10=700;
        int y10=700;
        while(y10>0){
            g.drawLine(x9, y9, x10, y10);
            y9-=2;
            y10-=10;
        }
    }

    public void paintScale(Graphics g) {
        System.out.println("Scale");

        int red, green, blue;
        int x1, y1, x2, y2;

        red = 0;
        green = 0;
        blue = 0;

        Color scaleColor = new Color(red, green, blue);
        g.setColor(scaleColor);

        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 400;

        while(x1 <= 400) {
            g.drawLine(x1, y1, x2, y2);

            x1++;
            x2++;

            if(red < 255 && x1 % 2 == 0) {
                red++;
                green++;
                blue++;
            }

            scaleColor = new Color(red, green, blue);
            g.setColor(scaleColor);
        }

        //draw the black triangle
        x1 = 400;
        y1 = 0;
        x2 = 0;
        y2 = 400;

        g.setColor(Color.BLACK);

        while(x1 >= 0){
            g.drawLine(x1, y1, x2, y2);
            x1 -= 1;
            y2 -= 1;
        }
    }

    public void paintRainbowRoad(Graphics g) {
        System.out.println("RainbowRoad");

        int red, green, blue;
        int x1, y1, x2, y2;

        red = 255;
        green = 0;
        blue = 0;

        Color scaleColor = new Color(red, green, blue);
        g.setColor(scaleColor);

        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 400;

        while(x1 <= 400) {
            g.drawLine(x1, y1, x2, y2);

            x1++;
            x2++;

            if(green <= 245) {
                green += 10;
            }

            if(green >= 245 && blue <= 245) {
                blue += 10;
            }

            scaleColor = new Color(red, green, blue);
            g.setColor(scaleColor);
        }
    }

    public void paintCrissCross(Graphics g) {
        System.out.println("Criss Cross");

        int x1 = 400;
        int y1 = 0;
        int x2 = 400;
        int y2 = 0;

        while(x1 >= 0){
            g.drawLine(x1, y1, x2, y2);
            x1 -= _inc;
            y2 += _inc;
        }

        x1 = 0;
        y1 = 0;
        x2 = 400;
        y2 = 400;

        while(y1 <= 400){
            g.drawLine(x1, y1, x2, y2);
            x2 -= _inc;
            y1 += _inc;
        }

        x1 = 400;
        y1 = 0;
        x2 = 0;
        y2 = 400;

        while(x1 >= 0){
            g.drawLine(x1, y1, x2, y2);
            x1 -= _inc;
            y2 -= _inc;
        }

        x1 = 400;
        y1 = 0;
        x2 = 0;
        y2 = 400;

        while(y1 <= 400){
            g.drawLine(x1, y1, x2, y2);
            x2 += _inc;
            y1 += _inc;
        }
    }

    public void paintHole(Graphics g) {
        System.out.println("Hole");
    }

    public void paintSpiral(Graphics g) {
        System.out.println("Spiral");
    }
}