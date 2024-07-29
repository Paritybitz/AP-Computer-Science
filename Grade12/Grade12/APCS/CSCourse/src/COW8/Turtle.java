package COW8;

import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Turtle
{
    private Block [][] map;
    private char direction;
    private boolean isAlive;
    //private ArrayList<String> discs;
    private int row, col;
    private int appleCount, orangeCount, lemonCount;
    private int delayMove, delayPlacement;
    private JPanel world;

    public Turtle(JPanel world, Block [][] map, char direction, int row, int col, int appleCount, int orangeCount, int lemonCount){
        this.world = world;
        this.map = map;
        this.direction = direction;
        //this.discs = discs;
        this.row = row;
        this.col = col;
        //map[row][col].addAnimal(this);
        isAlive = true;
        this.appleCount = appleCount;
        this.orangeCount = orangeCount;
        this.lemonCount = lemonCount;
        delayMove = 100;
        delayPlacement = 50;
    }

    public void setDelayMove(int delayMove){
        this.delayMove = delayMove;
    }

    public void setDelayPlacement(int delayPlacement){
        this.delayPlacement = delayPlacement;
    }

    public void moveTo(int row, int col){
        try {
            Thread.sleep(delayMove);
        }catch(InterruptedException e){
        }
        if(map[row][col].isWall()){
            isAlive = false;
        }else{
            map[row][col].addAnimal(this);
            map[this.row][this.col].removeAnimal();
            this.row = row;
            this.col = col;
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public void move(){
        //System.out.println("Moving");
        if(!isAlive){ return; }
        if(direction == 'N'){
            moveTo(row-1, col);
        }else if(direction == 'S'){
            moveTo(row+1, col);
        }else if(direction == 'E'){
            moveTo(row, col+1);
        }else if(direction == 'W'){
            moveTo(row, col-1);
        }
    }

    public void turnRight(){
        try {
            Thread.sleep(delayMove);
        }catch(InterruptedException e){
        }
        if(!isAlive){ return; }
        if(direction == 'N'){
            direction = 'E';
        }else if(direction == 'S'){
            direction = 'W';
        }else if(direction == 'E'){
            direction = 'S';
        }else if(direction == 'W'){
            direction = 'N';
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public void turnLeft(){
        try {
            Thread.sleep(delayMove);
        }catch(InterruptedException e){
        }
        if(!isAlive){ return; }
        if(direction == 'N'){
            direction = 'W';
        }else if(direction == 'S'){
            direction = 'E';
        }else if(direction == 'E'){
            direction = 'N';
        }else if(direction == 'W'){
            direction = 'S';
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public boolean frontIsClear(){
        if(!isAlive){ return false; }
        if(direction == 'N'){
            return !map[row-1][col].isWall();
        }else if(direction == 'S'){
            return !map[row+1][col].isWall();
        }else if(direction == 'E'){
            return !map[row][col+1].isWall();
        }else if(direction == 'W'){
            return !map[row][col-1].isWall();
        }
        return false;
    }

    public boolean leftIsClear(){
        if(!isAlive){ return false; }
        if(direction == 'N'){
            return !map[row][col-1].isWall();
        }else if(direction == 'S'){
            return !map[row][col+1].isWall();
        }else if(direction == 'E'){
            return !map[row-1][col].isWall();
        }else if(direction == 'W'){
            return !map[row+1][col].isWall();
        }
        return false;
    }

    public boolean rightIsClear(){
        if(!isAlive){ return false; }
        if(direction == 'N'){
            return !map[row][col+1].isWall();
        }else if(direction == 'S'){
            return !map[row][col-1].isWall();
        }else if(direction == 'E'){
            return !map[row+1][col].isWall();
        }else if(direction == 'W'){
            return !map[row-1][col].isWall();
        }
        return false;
    }

    public boolean isNextToApple(){
        return map[row][col].getAppleCount() > 0;
    }

    public boolean isNextToOrange(){
        return map[row][col].getOrangeCount() > 0;
    }

    public boolean isNextToLemon(){
        return map[row][col].getLemonCount() > 0;
    }

    public boolean hasApples(){
        return appleCount > 0;
    }

    public boolean hasOranges(){
        return orangeCount > 0;
    }

    public boolean hasLemons(){
        return lemonCount > 0;
    }

    public void pickApple(){
        try {
            Thread.sleep(delayPlacement);
        }catch(InterruptedException e){
        }
        if(isNextToApple()){
            map[row][col].removeApple();
            appleCount++;
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public void pickOrange(){
        try {
            Thread.sleep(delayPlacement);
        }catch(InterruptedException e){
        }
        if(isNextToOrange()){
            map[row][col].removeOrange();
            orangeCount++;
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public void pickLemon(){
        try {
            Thread.sleep(delayPlacement);
        }catch(InterruptedException e){
        }
        if(isNextToLemon()){
            map[row][col].removeLemon();
            lemonCount++;
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public void placeApple(){
        try {
            Thread.sleep(delayPlacement);
        }catch(InterruptedException e){
        }
        if(appleCount > 0){
            map[row][col].addApple();
            appleCount--;
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public void placeOrange(){
        try {
            Thread.sleep(delayPlacement);
        }catch(InterruptedException e){
        }
        if(orangeCount > 0){
            map[row][col].addOrange();
            orangeCount--;
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public void placeLemon(){
        try {
            Thread.sleep(delayPlacement);
        }catch(InterruptedException e){
        }
        if(lemonCount > 0){
            map[row][col].addLemon();
            lemonCount--;
        }
        world.paintImmediately(0,0,1000,1000);
    }

    public boolean isAlive(){
        return isAlive;
    }

    public void paint(Graphics g, int x, int y, int size){
        Color bodyColor = Color.GREEN;
        if(!isAlive()){
            bodyColor = Color.BLACK;
        }
        //draw head
        if(direction == 'N'){
            g.setColor(bodyColor);
            g.fillOval(x + (int)(size*.35), y, (int)(size*.3), (int)(size*.3));
            g.setColor(Color.BLACK);
            g.drawOval(x + (int)(size*.35), y, (int)(size*.3), (int)(size*.3));
            g.setColor(bodyColor);
            g.fillOval(x + (int)(size*.15), y + (int)(size*.3), (int)(size*.7), (int)(size*.7));
            g.setColor(Color.BLACK);
            g.drawOval(x + (int)(size*.15), y + (int)(size*.3), (int)(size*.7), (int)(size*.7));
        }else if(direction == 'S'){
            g.setColor(bodyColor);
            g.fillOval(x + (int)(size*.35), y + (int)(size*.7), (int)(size*.3), (int)(size*.3));
            g.setColor(Color.BLACK);
            g.drawOval(x + (int)(size*.35), y + (int)(size*.7), (int)(size*.3), (int)(size*.3));
            g.setColor(bodyColor);
            g.fillOval(x + (int)(size*.15), y, (int)(size*.7), (int)(size*.7));
            g.setColor(Color.BLACK);
            g.drawOval(x + (int)(size*.15), y, (int)(size*.7), (int)(size*.7));
        }else if(direction == 'E'){
            g.setColor(bodyColor);
            g.fillOval(x + (int)(size*.7), y + (int)(size*.35), (int)(size*.3), (int)(size*.3));
            g.setColor(Color.BLACK);
            g.drawOval(x + (int)(size*.7), y + (int)(size*.35), (int)(size*.3), (int)(size*.3));
            g.setColor(bodyColor);
            g.fillOval(x, y + (int)(size*.15), (int)(size*.7), (int)(size*.7));
            g.setColor(Color.BLACK);
            g.drawOval(x, y + (int)(size*.15), (int)(size*.7), (int)(size*.7));
        }else if(direction == 'W'){
            g.setColor(bodyColor);
            g.fillOval(x, y + (int)(size*.35), (int)(size*.3), (int)(size*.3));
            g.setColor(Color.BLACK);
            g.drawOval(x, y + (int)(size*.35), (int)(size*.3), (int)(size*.3));
            g.setColor(bodyColor);
            g.fillOval(x + (int)(size*.3), y + (int)(size*.15), (int)(size*.7), (int)(size*.7));
            g.setColor(Color.BLACK);
            g.drawOval(x + (int)(size*.3), y + (int)(size*.15), (int)(size*.7), (int)(size*.7));
        }
    }
}