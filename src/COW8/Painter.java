package COW8;

import java.awt.*;

public class Painter {
    public void paintBoxGrid(Graphics g) {
        int x = 10, y = 10, width = 30, height = 30;

        for (int row = 1; row <= 14; row++) {
            for (int col = 1; col <= 14; col++) {
                g.fillRect(x, y, width, height);
                x += 40;
            }
            y += 40;
            x = 10;
        }
    }

    public void paintMultiplicationTable(Graphics g) {
        int x = 0, y = 0, width = 1, height = 0;

        for (int col = 1; col <= 14; col++) {
            x += 40;
            y = 10;
            height = 1;
            width += 1;

            for (int row = 1; row <= 14; row++) {
                g.fillRect(x, y, width, height);

                y += 40;
                height += 1;
            }
        }
    }

    public void paintBrickWall(Graphics g) {
        int x = 0, y = 0, width = 60, height = 30;

        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 7; col++) {
                while (x <= 600) {
                    g.setColor(Color.RED);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.GRAY);
                    g.drawRect(x, y, width, height);
                    x += 60;
                }
                y += 60;
                x = 0;
            }


        }
        y = 30;
        x = 30;

        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 7; col++) {
                while (x <= 680) {
                    g.setColor(Color.RED);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.GRAY);
                    g.drawRect(x, y, width, height);
                    x += 60;
                }
                y += 60;
                x = 30;
            }
        }
        y = 30;

        while (y <= 1000) {
            g.setColor(Color.RED);
            g.fillRect(0, y, 30, 30);
            g.setColor(Color.GRAY);
            g.drawRect(0, y, 30, 30);
            y += 60;
        }
        g.setColor(Color.BLACK);
        g.fillRect(600, 0, 1000, 1000);
        g.fillRect(0, 601, 1000, 1000);
        g.setColor(Color.GRAY);
        g.drawLine(600, 0, 600, 601);
    }

    public void paintZigZag(Graphics g) {
        //For drawing singular zig-zag line
        int x1 = 0;
        int y1 = 0;
        int x2 = 20;
        int y2 = 30;
        int xChange = 20;
        int yChange = 30;
        int nextCol = 30;

        for (int col = 0; col < 30; col++) {

            for (int zigzags = 0; zigzags <= 17; zigzags++) {
                g.drawLine(x1, y1, x2, y2);
                x1 += xChange;
                y1 += yChange;
                x2 -= xChange;
                y2 += yChange;
                g.drawLine(x1, y1, x2, y2);
                x1 -= xChange;
                y1 += yChange;
                x2 += xChange;
                y2 += yChange;
            }

            x1 += nextCol;
            y1 = 0;
            y2 = 30;
            x2 += nextCol;
        }
    }

    public void paintWallPaper70s(Graphics g) {
        int rectX = 0;

        int rectWidth = 50;
        int rectHeight = 700;

        /*for (int rect = 1; rect <= 14; rect++) {
            g.setColor(new Color((int)(255 * Math.random()), (int)(255 * Math.random()), (int)(255 * Math.random())));
            g.fillRect(rectX, rectY, rectWidth, rectHeight);

            int circleX = 0, circleY = 0, circleWidth = 100, circleHeight = 100;

            for (int row = 1; row <= 7; row++) {
                for (int col = 1; col <= 7; col++) {
                    g.setColor(new Color((int)(255 * Math.random()), (int)(255 * Math.random()), (int)(255 * Math.random())));
                    g.fillOval(circleX, circleY, circleWidth, circleHeight);
                    circleY += 100;
                }
                circleY = 0;
                circleX += 100;
            }

            rectX += 50;
        }*/

        //print rects
        for (int rect = 1; rect <= 14; rect++, rectX += 50) {
            g.setColor(new Color((int) (255 * Math.random()), (int) (255 * Math.random()), (int) (255 * Math.random())));
            g.fillRect(rectX, 0, rectWidth, rectHeight);
        }

        //draw circles
        int circleX = 0, circleY = 0, circleWidth = 100, circleHeight = 100;

        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 7; col++) {
                g.setColor(new Color((int) (255 * Math.random()), (int) (255 * Math.random()), (int) (255 * Math.random())));
                g.fillOval(circleX, circleY, circleWidth, circleHeight);
                circleY += 100;
            }

            circleY = 0;
            circleX += 100;
        }
    }

    public void paintGridAndLines(Graphics g) {
        //horizontal
        int y = 5;

        while (y <= 410) {
            g.drawLine(0, y, 400, y);
            y += 20;
        }
        //vertical
        int x = 5;

        while (x <= 410) {
            g.drawLine(x, 0, x, 400);
            x += 20;
        }

        x = 10;
        y = 10;
        int width = 10;
        int height = 10;

        for (int row = 1; row <= 20; row++) {
            for (int col = 1; col <= 20; col++) {
                g.fillRect(x, y, width, height);
                x += 20;
            }
            y += 20;
            x = 10;
        }
    }

    public void paintTubularTwo(Graphics g) {
        int x = 70;
        int width = 60;
        int height = 700;

        for (int tube = 0; tube < 8; tube++, x += 120) {
            int red = 100, green = 100, blue = 100;
            int lineX = x;

            while (++lineX <= x + width) {
                g.setColor(new Color(red, green, blue));

                g.drawLine(lineX, 0, lineX, height);

                if (lineX < (x + width/2)) {
                    if (red <= 245 && lineX % 2 == 0) {
                        red = green = blue = red + 10;
                    }
                }
                else {
                    if (red > 0 && lineX % 2 == 0) {
                        red = green = blue = red - 10;
                    }
                }
            }
        }
    }

    public void paintPatchworkMax(Graphics g) {
        int height=100, width=100;
        char dir = 'H';     //horizontal

        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 7; col++) {
                int x = col * width;
                int y = row * height;

                //draw box
                for (int line=0; line <= 20; line++) {
                    if (dir == 'H') {
                        g.drawLine(x, y, x + width, y);
                        y+=5;
                    }
                    else {
                        g.drawLine(x, y, x, y+height);
                        x+=5;
                    }
                }

                //flip direction
                dir = (dir == 'H' ? 'V' : 'H');
            }
        }
    }

    public void paintTiledFloor(Graphics g) {
        int x = 0, y = 0;
        int height = 25, width = 25;

        //draw checkerboard
        for (int col = 1; col <= 7; col++){
            for (int row = 1; row <= 7; row++){
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
                y += height;
                g.setColor(Color.BLUE);
                g.fillRect(x, y, width, height);
                y += height;
            }
            y = 0;
            x += width * 2;
        }

        x = width;
        y = 0;
        for (int col = 1; col <= 7; col++){
            for (int row = 1; row <= 7; row++){
                g.setColor(Color.BLUE);
                g.fillRect(x, y, width, height);
                y += height;
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
                y += height;
            }
            y = 0;
            x += width * 2;
        }

        //draw square lines
        x = 0;
        y = 0;
        for (int col = 1; col <= 14; col++){
            for (int row = 1; row <= 14; row++){
                g.setColor(Color.WHITE);
                g.drawRect(x, y, width, height);
                y += height;
            }
            y = 0;
            x += width;
        }

        //draw diagonal lines
        int x1 = 400;
        int y1 = 0;
        int x2 = 400;
        int y2 = 0;

        while(x1 >= 0){
            g.drawLine(x1, y1, x2, y2);
            x1 -= 50;
            y2 += 50;
        }

        x1 = 0;
        y1 = 0;
        x2 = 400;
        y2 = 400;

        while(y1 <= 400){
            g.drawLine(x1, y1, x2, y2);
            x2 -= 50;
            y1 += 50;
        }

        x1 = 400;
        y1 = 0;
        x2 = 0;
        y2 = 400;

        while(x1 >= 0){
            g.drawLine(x1, y1, x2, y2);
            x1 -= 50;
            y2 -= 50;
        }

        x1 = 400;
        y1 = 0;
        x2 = 0;
        y2 = 400;

        while(y1 <= 400){
            g.drawLine(x1, y1, x2, y2);
            x2 += 50;
            y1 += 50;
        }
        //clean up sides
        g.setColor(Color.BLACK);
        g.fillRect(351, 0, 100, 700);
        g.setColor(Color.BLACK);
        g.fillRect(0, 351, 700, 100);
    }

    public void paintPatchWork(Graphics g) {
        int x = 0;
        int y = 0;
        int flatWidth = 100;
        int flatHeight = 25;
        int tallWidth = 25;
        int tallHeight = 100;

        //blue lines
        for (int col = 1; col <= 7; col++){
            for (int row = 1; row <= 7; row++){
                g.setColor(Color.BLUE);
                g.fillRect(x, y, tallWidth, tallHeight);
                y += tallHeight + flatHeight;

            }
            x += flatWidth;
            y = 0;
        }

        //yellow lines
        x = 50;
        y = 50;
        for (int col = 1; col <= 7; col++){
            for (int row = 1; row <= 7; row++){
                g.setColor(Color.YELLOW);
                g.fillRect(x, y, tallWidth, tallHeight);
                y += tallHeight + flatHeight;

            }
            x += flatWidth;
            y = 50;
        }

        //green lines
        x = 25;
        y = 50;
        for (int col = 1; col <= 7; col++){
            for (int row = 1; row <= 7; row++){
                g.setColor(Color.GREEN);
                g.fillRect(x, y, flatWidth, flatHeight);
                x += tallWidth + flatWidth;

            }
            y += tallHeight;
            x = 25;
        }
    }

    public void paintRainbowFade(Graphics g) {

    }

    public void paintDiscoDown(Graphics g) {

    }

}