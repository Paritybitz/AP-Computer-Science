package COW15;

import java.awt.*;

public class Light
{
    boolean on;
    Color   theColor;
    
    public Light(){
        on = false;
        theColor = Color.WHITE;
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void setColor(Color aColor){
        theColor = aColor;
    }
    
    public Color getColor(){
        return theColor;
    }
    
    public void draw(Graphics g, int x, int y){
        if(on){
            g.setColor(theColor);
            g.fillRect(x, y, Board.pixelSize, Board.pixelSize);
        }else{
            g.setColor(new Color(10, 10, 10));
            g.drawRect(x, y, Board.pixelSize, Board.pixelSize);
        }
    }
}
