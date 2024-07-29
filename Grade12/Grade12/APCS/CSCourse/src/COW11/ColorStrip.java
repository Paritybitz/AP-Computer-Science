package COW11;

import java.awt.*;

public class ColorStrip
{
    private int red, green, blue;
    
    public ColorStrip(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
    }
    
    public String paint(Graphics g, int x, int y, int width, int height){
        g.setColor(new Color(red, green, blue));
        g.fillRect(x, y, width, height);
        g.setColor(Color.WHITE);
        String values = "Red: \t" + red + "\t,    Green: \t" + green + "\t,    Blue: \t" + blue;
        g.drawString(values, x+width, y+height-3);
        return values;
    }
}
