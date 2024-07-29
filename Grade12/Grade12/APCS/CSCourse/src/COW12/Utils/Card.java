package COW12.Utils;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;
public class Card
{
    public int getValue(){
        return 0;
    }

    int height, width;
    Color theColor;
    int value;


    public Card(int value, Color aColor){
        height = 90;
        width = 70;
        theColor = aColor;
        this.value = value;
    }

    public void drawMyself(Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
        g.setColor(theColor);
        g.setFont(new Font("Courior", Font.BOLD, 50));
        if(value < 10){
            String symbol = value + "";
            g.drawString(symbol, x + 18, y + 60);
        }else if(value == 10){
            String symbol = value + "";
            g.drawString(symbol, x + 10, y + 60);
        }else if(value == 11){
            String symbol = "J";
            g.drawString(symbol, x + 18, y + 60);
        }else if(value == 12){
            String symbol = "Q";
            g.drawString(symbol, x + 18, y + 60);
        }else if(value == 13){
            String symbol = "K";
            g.drawString(symbol, x + 18, y + 60);
        }else if(value == 14){
            String symbol = "A";
            g.drawString(symbol, x + 18, y + 60);
        }
    }


}