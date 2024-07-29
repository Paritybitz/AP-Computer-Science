package COW4.Tests;

import java.awt.*;
public class Block
{
    private boolean isWall;
    private Turtle animal;
    private int fruitCount;

    public Block(boolean isWall, Turtle animal, int fruitCount){
        this.isWall = isWall;
        this.animal = animal;
        this.fruitCount = fruitCount;
    }

    public boolean isWall(){ return isWall; }
    public int getFruitCount(){ return fruitCount; }
    public void removeFruit(){
        if(fruitCount > 0){
            fruitCount--;
        }
    }

    public void addFruit(){
        fruitCount++;
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

    public void paint(Graphics g, int x, int y, int size){
        if(isWall){
            g.setColor(Color.GRAY);
            g.fillRect(x, y, size, size);
        }else if(fruitCount > 0){
            g.setColor(Color.RED);
            g.fillRect(x, y, size, size);
            g.setColor(Color.BLACK);
            String fruitCountString = ""+fruitCount;
            g.setFont(new Font("Times New Roman", Font.BOLD, 30));
            g.drawString(fruitCountString, x + (int)(size*.25), y+(int)(size*.9));
        }
        int unit = size/10;
        if(animal != null){
            animal.paint(g, x, y, size);


        }
    }

}