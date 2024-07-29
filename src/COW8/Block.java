package COW8;

import java.util.*;
import java.awt.*;
public class Block
{
    private boolean isWall;
    private Turtle animal;
    private int appleCount, orangeCount, lemonCount;

    public Block(boolean isWall, Turtle animal, int appleCount, int orangeCount, int lemonCount){
        this.isWall = isWall;
        this.animal = animal;
        this.appleCount = appleCount;
        this.orangeCount = orangeCount;
        this.lemonCount = lemonCount;
    }

    public boolean isWall(){ return isWall; }
    public int getAppleCount(){ return appleCount; }
    public int getOrangeCount(){ return orangeCount; }
    public int getLemonCount(){ return lemonCount; }
    public Turtle getTurtle(){ return animal; }

    public void removeApple(){
        if(appleCount > 0){
            appleCount--;
        }
    }
    public void removeOrange(){
        if(orangeCount > 0){
            orangeCount--;
        }
    }
    public void removeLemon(){
        if(lemonCount > 0){
            lemonCount--;
        }
    }

    public void addApple(){
        appleCount++;
    }
    public void addOrange(){
        orangeCount++;
    }
    public void addLemon(){
        lemonCount++;
    }

    public void addAnimal(Turtle animal){
        this.animal = animal;
    }
    public void removeAnimal(){
        animal = null;
    }
    public boolean hasAnimal(){
        return animal != null;
    }

    public boolean equals(Block otherBlock, boolean checkMyrtle){
        if(isWall != otherBlock.isWall()){
            return false;
        }
        if(appleCount != otherBlock.getAppleCount()){
            return false;
        }
        if(orangeCount != otherBlock.getOrangeCount()){
            return false;
        }
        if(lemonCount != otherBlock.getLemonCount()){
            return false;
        }
        if(checkMyrtle && hasAnimal() != otherBlock.hasAnimal()){
            return false;
        }
        return true;
    }

    public void paint(Graphics g, int x, int y, int size){
        if(isWall){
            g.setColor(Color.GRAY);
            g.fillRect(x, y, size, size);
        }
        if(appleCount > 0){
            g.setColor(Color.RED);
            g.fillRect(x, y, size, size/3);
            g.setColor(Color.BLACK);
            String appleCountString = "" + appleCount;
            g.setFont(new Font("Times New Roman", Font.BOLD, 20));
            g.drawString(appleCountString, x, y+(int)(size/3)-2);
        }
        if(orangeCount > 0){
            g.setColor(Color.ORANGE);
            g.fillRect(x, y + size/3, size, size/3);
            g.setColor(Color.BLACK);
            String orangeCountString = "" + orangeCount;
            g.setFont(new Font("Times New Roman", Font.BOLD, 20));
            g.drawString(orangeCountString, x, y+(int)(2*size/3)-2);
        }
        if(lemonCount > 0){
            g.setColor(Color.YELLOW);
            g.fillRect(x, y + 2*size/3, size, size/3);
            g.setColor(Color.BLACK);
            String lemonCountString = "" + lemonCount;
            g.setFont(new Font("Times New Roman", Font.BOLD, 20));
            g.drawString(lemonCountString, x, y+(int)(size)-2);
        }
        int unit = size/10;
        if(animal != null){
            animal.paint(g, x, y, size);
        }
    }

}