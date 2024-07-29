package COW8.Tests;

import COW8.Block;
import COW8.Myrtle;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class MyrtleTester extends JPanel implements ActionListener, MouseListener, KeyListener
{
    private JFrame theFrame;
    private ArrayList<Button> theButtons;
    private Color backgroundColor;
    private String name;
    private boolean gameOver;
    private Block [][] mapStart, mapEnd;
    private int blockSize;
    private boolean mapLoaded;
    private ArrayList<Myrtle> theMyrtles;

    public MyrtleTester(JFrame theFrame){

        setLayout(null);
        blockSize = 45;
        mapLoaded = false;

        String[] options = {"pickRowOfApples", "pickApplesToWall", "pickRowOfFruit", "pickFruitToWall", "harvestRow&Deposit", "placeRowOfFruit",
                "harvestAll&Deposit", "placeGrid", "searchForFruit ", "placeSpiral ", "placePyramid", "fillMazeWithFruits "};
        theButtons = new ArrayList<Button>();
        int index = 0;
        int x = 0;
        int y = 0;
        int width = 125;
        while(index < options.length){
            Button nextButton = new Button(options[index]);
            nextButton.setBounds(x, y, width, blockSize/2);
            nextButton.setBackground(Color.WHITE);
            nextButton.setActionCommand(options[index]);
            add(nextButton);
            nextButton.addActionListener(this);
            index += 1;
            x += width;
            if(x >= options.length/2 * width){
                x = 0;
                y += blockSize/2;
            }
        }

        backgroundColor = Color.WHITE;
        name = "";
        gameOver = false;
        this.theFrame = theFrame;

    }

    public void actionPerformed (ActionEvent event)
    {
        String command = event.getActionCommand();
        System.out.println("Command: " + command);
        if(command.equals("pickRowOfApples")){
            boolean one = testPickRowOfApples();
            if(one){
                System.out.println("pickRowOfApples Worked");
            }else{
                System.out.println("pickRowOfApples DID NOT Work!!!");
            }
        }else if(command.equals("pickApplesToWall")){
            boolean one = testPickApplesToWall();
            if(one){
                System.out.println("pickApplesToWall Worked");
            }else{
                System.out.println("pickApplesToWall DID NOT Work!!!");
            }
        }else if(command.equals("pickRowOfFruit")){
            boolean one = testPickRowOfFruit();
            if(one){
                System.out.println("pickRowOfFruit Worked");
            }else{
                System.out.println("pickRowOfFruit DID NOT Work!!!");
            }
        }else if(command.equals("pickFruitToWall")){
            boolean one = testPickFruitToWall();
            if(one){
                System.out.println("pickFruitToWall Worked");
            }else{
                System.out.println("pickFruitToWall DID NOT Work!!!");
            }
        }else if(command.equals("harvestRow&Deposit")){
            boolean one = testHarvestRowAndDeposit();
            if(one){
                System.out.println("harvestRow&Deposit Worked");
            }else{
                System.out.println("harvestRow&Deposit DID NOT Work!!!");
            }
        }else if(command.equals("placeRowOfFruit")){
            boolean one = testPlaceRowOfFruit();
            if(one){
                System.out.println("placeRowOfFruit Worked");
            }else{
                System.out.println("placeRowOfFruit DID NOT Work!!!");
            }
        }else if(command.equals("harvestAll&Deposit")){
            boolean one = testHarvestAllAndDeposit();
            if(one){
                System.out.println("harvestAllAndDeposit Worked");
            }else{
                System.out.println("harvestAllAndDeposit DID NOT Work!!!");
            }
        }else if(command.equals("placeGrid")){
            boolean one = testPlaceGrid();
            if(one){
                System.out.println("placeGrid Worked");
            }else{
                System.out.println("placeGrid DID NOT Work!!!");
            }
        }else if(command.equals("searchForFruit ")){
            boolean one = testSearchForFruit ();
            if(one){
                System.out.println("searchForFruit  Worked");
            }else{
                System.out.println("searchForFruit  DID NOT Work!!!");
            }
        }else if(command.equals("placeSpiral ")){
            boolean one = testPlaceSpiral ();
            if(one){
                System.out.println("placeSpiral   Worked");
            }else{
                System.out.println("placeSpiral   DID NOT Work!!!");
            }
        }else if(command.equals("placePyramid")){
            boolean one = testPlacePyramid();
            if(one){
                System.out.println("placePyramid    Worked");
            }else{
                System.out.println("placePyramid  DID NOT Work!!!");
            }
        }else if(command.equals("fillMazeWithFruits ")){
            boolean one = testFillMazeWithFruits();
            if(one){
                System.out.println("fillMazeWithFruits   Worked");
            }else{
                System.out.println("fillMazeWithFruits   DID NOT Work!!!");
            }
        }

        // else if(command.equals("Test Move To Wall")){
        // String [] stringMap = {"XXXXXXXXXXXXXX",
        // "XOEOOOOOOXOOOX",
        // "XOEOXOOOOOOOOX",
        // "XOEOOOOOOOOOOX",
        // "XOEOOOOOOOOOXX",
        // "XXXXXXXXXXXXXX",};
        // loadMap(stringMap);
        // for(int i = 0; i < theMyrtles.size(); i++){
        // //System.out.println("Moving next myrtle");
        // theMyrtles.get(i).moveToWall();
        // }
        // }placeRowOfFruit

        repaint();
        paintImmediately(0,0,1000,1000);
        theFrame.requestFocus();

    }

    public boolean testPickRowOfApples(){

        theMyrtles = new ArrayList<Myrtle>();
        String [] stringMapStart = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A1O0L0SN _A5O0L0SN _A7O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A9O0L0SN _A2O0L0SN _A4O0L0SN _A4O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A6O0L0SN _A8O0L0SN _A2O0L0SN _A6O0L0SN _A20O0L0SN _A2O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A3O0L0SN _A1O0L0SN _A5O0L0SN _A9O0L0SN _A25O0L0SN _A0O0L0SN _A3O0L0SN _A4O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        String [] stringMapEnd = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).pickRowOfApples(3);
        theMyrtles.get(1).pickRowOfApples(4);
        theMyrtles.get(2).pickRowOfApples(6);
        theMyrtles.get(3).pickRowOfApples(8);
        if(doMapsMatch(mapStart, mapEnd, true)){
            return true;
        }else{
            return false;
        }
    }

    // "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
    // "XA0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
    // "XA0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
    // "XA0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
    // "XA0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
    // "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};

    public boolean testPickApplesToWall(){
        theMyrtles = new ArrayList<Myrtle>();
        String [] stringMapStart = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A5O0L0SN _A5O0L0SN _A5O0L0SN _A5O0L0SN _A5O0L0SN _A5O0L0SN _A5O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A12O0L0SN _A12O0L0SN _A12O0L0SN _A12O0L0SN _A12O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A25O0L0SN _A25O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A6O0L0SN _A9O0L0SN _A12O0L0SN _A15O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        String [] stringMapEnd = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A2O0L0SN _A2O0L0SN _A2O0L0SN _A2O0L0SN _A2O0L0SMEA0O0L0S XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A10O0L0SN _A10O0L0SMEA0O0L0S XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A3O0L0SN _A6O0L0SN _A9O0L0SN _A12O0L0SMEA0O0L0S XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).pickApplesToWall(5);
        theMyrtles.get(1).pickApplesToWall(10);
        theMyrtles.get(2).pickApplesToWall(15);
        theMyrtles.get(3).pickApplesToWall(3);
        if(doMapsMatch(mapStart, mapEnd, true)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testPickRowOfFruit(){
        theMyrtles = new ArrayList<Myrtle>();
        String [] stringMapStart = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A1O0L0SN _A0O5L0SN _A0O0L7SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A9O0L0SN _A0O2L0SN _A0O0L4SN _A4O8L5SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A6O0L0SN _A0O8L0SN _A0O0L2SN _A6O7L8SN _A20O3L0SN _A2O0L9SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A3O0L0SN _A0O1L0SN _A0O0L5SN _A9O3L2SN _A25O0L7SN _A0O5L0SN _A3O3L3SN _A4O5L6SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        String [] stringMapEnd = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).pickRowOfFruit(3);
        theMyrtles.get(1).pickRowOfFruit(4);
        theMyrtles.get(2).pickRowOfFruit(6);
        theMyrtles.get(3).pickRowOfFruit(8);
        if(doMapsMatch(mapStart, mapEnd, true)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testPickFruitToWall(){
        theMyrtles = new ArrayList<Myrtle>();
        String [] stringMapStart = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A5O5L5SN _A5O5L5SN _A5O5L5SN _A5O5L5SN _A5O5L5SN _A5O5L5SN _A5O5L5SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A12O12L12SN _A12O12L12SN _A12O12L12SN _A12O12L12SN _A12O12L12SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A25O25L25SN _A25O25L25SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A6O8L7SN _A9O7L5SN _A12O13L3SN _A15O34L9SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        String [] stringMapEnd = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SMEA0O0L0S XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A2O2L2SN _A2O2L2SN _A2O2L2SN _A2O2L2SN _A2O2L2SMEA0O0L0S XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A10O10L10SN _A10O10L10SMEA0O0L0S XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A3O4L5SN _A6O3L3SN _A9O9L1SN _A12O30L7SMEA0O0L0S XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).pickFruitToWall(5, 5, 5);
        theMyrtles.get(1).pickFruitToWall(10, 10, 10);
        theMyrtles.get(2).pickFruitToWall(15, 15, 15);
        theMyrtles.get(3).pickFruitToWall(3, 4, 2);
        if(doMapsMatch(mapStart, mapEnd, true)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testHarvestRowAndDeposit(){
        theMyrtles = new ArrayList<Myrtle>();
        String [] stringMapStart = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A1O0L0SN _A0O5L0SN _A0O0L7SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A9O0L0SN _A0O2L0SN _A0O0L4SN _A4O8L5SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A6O0L0SN _A0O8L0SN _A0O0L2SN _A6O7L8SN _A20O3L0SN _A2O0L9SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A3O0L0SN _A0O1L0SN _A0O0L5SN _A9O3L2SN _A25O0L7SN _A0O5L0SN _A3O3L3SN _A4O5L6SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        String [] stringMapEnd = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A1O5L7SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A13O10L9SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A34O18L19SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A44O17L23SMEA0O0L0S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).harvestRowAndDeposit(3);
        theMyrtles.get(1).harvestRowAndDeposit(4);
        theMyrtles.get(2).harvestRowAndDeposit(6);
        theMyrtles.get(3).harvestRowAndDeposit(8);
        if(doMapsMatch(mapStart, mapEnd, false)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testPlaceRowOfFruit(){
        theMyrtles = new ArrayList<Myrtle>();
        String [] stringMapStart = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA999O999L999S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA999O999L999S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA999O999L999S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA999O999L999S _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        String [] stringMapEnd = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A20O20L20SN _A20O20L20SN _A20O20L20SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A10O10L10SN _A10O10L10SN _A10O10L10SN _A10O10L10SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A15O10L5SN _A15O10L5SN _A15O10L5SN _A15O10L5SN _A15O10L5SN _A15O10L5SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SMEA0O0L0S _A2O6L3SN _A2O6L3SN _A2O6L3SN _A2O6L3SN _A2O6L3SN _A2O6L3SN _A2O6L3SN _A2O6L3SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).placeRowOfFruit(3, 20, 20, 20);
        theMyrtles.get(1).placeRowOfFruit(4, 10, 10, 10);
        theMyrtles.get(2).placeRowOfFruit(6, 15, 10, 5);
        theMyrtles.get(3).placeRowOfFruit(8, 2, 6, 3);
        if(doMapsMatch(mapStart, mapEnd, true)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testHarvestAllAndDeposit(){
        theMyrtles = new ArrayList<Myrtle>();

        //initialize temp maps
        String [][] locationsStart = new String[15][15];
        String [][] locationsEnd = new String[15][15];
        for(int row = 0; row < locationsStart.length; row++){
            locationsStart[row][0] = "XA0O0L0SN";
            locationsStart[row][locationsStart[row].length-1] = "XA0O0L0SN";
            locationsEnd[row][0] = "XA0O0L0SN";
            locationsEnd[row][locationsStart[row].length-1] = "XA0O0L0SN";
        }
        for(int col = 0; col < locationsStart[0].length; col++){
            locationsStart[0][col] = "XA0O0L0SN";
            locationsStart[locationsStart.length-1][col] = "XA0O0L0SN";
            locationsEnd[0][col] = "XA0O0L0SN";
            locationsEnd[locationsStart.length-1][col] = "XA0O0L0SN";
        }
        for(int row = 1; row < locationsStart.length-1; row++){
            for(int col = 1; col < locationsStart[0].length-1; col++){
                locationsStart[row][col] = "_A0O0L0SN";
                locationsEnd[row][col] = "_A0O0L0SN";
            }
        }

        int[][] apples = new int[12][12];
        int[][] oranges = new int[12][12];
        int[][] lemons = new int[12][12];
        for(int row = 0; row < apples.length; row++){
            for(int col = 0; col < apples.length; col++){
                int nextAppleCount = (int)(Math.random() * 10);
                apples[row][col] = nextAppleCount;
                int nextOrangeCount = (int)(Math.random() * 10);
                oranges[row][col] = nextOrangeCount;
                int nextLemonCount = (int)(Math.random() * 10);
                lemons[row][col] = nextLemonCount;
                locationsStart[row+2][col+2] = "_A"+ nextAppleCount + "O"+ nextOrangeCount + "L"+ nextLemonCount + "SN";
                locationsEnd[row+2][col+2] = "_A"+ nextAppleCount + "O"+ nextOrangeCount + "L"+ nextLemonCount + "SN";
            }
        }
        locationsStart[locationsStart.length-2][1] = "_A0O0L0SMEA0O0L0S";

        int randomWidth = 1 + (int)(Math.random() * 11);
        int randomHeight = 1 + (int)(Math.random() * 11);
        int[] appleTotals = new int[randomHeight];
        int[] orangeTotals = new int[randomHeight];
        int[] lemonTotals = new int[randomHeight];
        for(int row = 13; row > 13-randomHeight; row--){
            int nextAppleTotal = 0;
            int nextOrangeTotal = 0;
            int nextLemonTotal = 0;
            for(int col = 2; col < 2 + randomWidth ; col++){
                nextAppleTotal += apples[row-2][col-2];
                nextOrangeTotal += oranges[row-2][col-2];
                nextLemonTotal += lemons[row-2][col-2];
                locationsEnd[row][col] = "_A0O0L0SN";
            }
            locationsEnd[row][1] = "_A"+ nextAppleTotal + "O"+ nextOrangeTotal + "L"+ nextLemonTotal + "SN";
        }
        locationsEnd[locationsStart.length-1-randomHeight][1] = locationsEnd[locationsStart.length-1-randomHeight][1].substring(0,locationsEnd[locationsStart.length-1-randomHeight][1].length()-1) + "MEA0O0L0S";

        String [] stringMapStart = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsStart[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapStart[row] = nextLine;
        }
        String [] stringMapEnd = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsEnd[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapEnd[row] = nextLine;
        }

        System.out.println("Testing Width: " + randomWidth + ", Height: " + randomHeight);
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).setDelayMove(50);
        theMyrtles.get(0).setDelayPlacement(2);
        theMyrtles.get(0).harvestAllAndDeposit(randomWidth, randomHeight);
        if(doMapsMatch(mapStart, mapEnd, false)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testPlaceGrid(){
        theMyrtles = new ArrayList<Myrtle>();

        //initialize temp maps
        String [][] locationsStart = new String[15][15];
        String [][] locationsEnd = new String[15][15];
        for(int row = 0; row < locationsStart.length; row++){
            locationsStart[row][0] = "XA0O0L0SN";
            locationsStart[row][locationsStart[row].length-1] = "XA0O0L0SN";
            locationsEnd[row][0] = "XA0O0L0SN";
            locationsEnd[row][locationsStart[row].length-1] = "XA0O0L0SN";
        }
        for(int col = 0; col < locationsStart[0].length; col++){
            locationsStart[0][col] = "XA0O0L0SN";
            locationsStart[locationsStart.length-1][col] = "XA0O0L0SN";
            locationsEnd[0][col] = "XA0O0L0SN";
            locationsEnd[locationsStart.length-1][col] = "XA0O0L0SN";
        }
        for(int row = 1; row < locationsStart.length-1; row++){
            for(int col = 1; col < locationsStart[0].length-1; col++){
                locationsStart[row][col] = "_A0O0L0SN";
                locationsEnd[row][col] = "_A0O0L0SN";
            }
        }

        //place grid of fruit in end map
        int randomWidth = 1 + (int)(Math.random() * 11);
        int randomHeight = 1 + (int)(Math.random() * 11);
        int nextAppleCount = (int)(Math.random() * 10);
        int nextOrangeCount = (int)(Math.random() * 10);
        int nextLemonCount = (int)(Math.random() * 10);
        for(int row = locationsEnd.length-2; row > locationsEnd.length-2-randomHeight; row--){
            for(int col = 2; col < 2 + randomWidth; col++){
                locationsEnd[row][col] = "_A"+ nextAppleCount + "O"+ nextOrangeCount + "L"+ nextLemonCount + "SN";
            }
        }

        //place myrtles
        locationsStart[locationsStart.length-2][1] = "_A0O0L0SMEA999O999L999S";
        locationsEnd[locationsStart.length-1-randomHeight][1] = locationsEnd[locationsStart.length-1-randomHeight][1].substring(0,locationsEnd[locationsStart.length-1-randomHeight][1].length()-1) + "MEA0O0L0S";

        String [] stringMapStart = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsStart[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapStart[row] = nextLine;
        }
        String [] stringMapEnd = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsEnd[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapEnd[row] = nextLine;
        }

        System.out.println("Testing Width: " + randomWidth + ", Height: " + randomHeight + ", with " + nextAppleCount + " apples, " + nextOrangeCount + " orange, " + nextLemonCount + " lemons, ");
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).setDelayMove(50);
        theMyrtles.get(0).setDelayPlacement(2);
        theMyrtles.get(0).placeGrid(randomWidth, randomHeight, nextAppleCount, nextOrangeCount, nextLemonCount);
        if(doMapsMatch(mapStart, mapEnd, false)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testSearchForFruit(){
        theMyrtles = new ArrayList<Myrtle>();

        //initialize temp maps
        String [][] locationsStart = new String[15][15];
        String [][] locationsEnd = new String[15][15];
        for(int row = 0; row < locationsStart.length; row++){
            locationsStart[row][0] = "XA0O0L0SN";
            locationsStart[row][locationsStart[row].length-1] = "XA0O0L0SN";
            locationsEnd[row][0] = "XA0O0L0SN";
            locationsEnd[row][locationsStart[row].length-1] = "XA0O0L0SN";
        }
        for(int col = 0; col < locationsStart[0].length; col++){
            locationsStart[0][col] = "XA0O0L0SN";
            locationsStart[locationsStart.length-1][col] = "XA0O0L0SN";
            locationsEnd[0][col] = "XA0O0L0SN";
            locationsEnd[locationsStart.length-1][col] = "XA0O0L0SN";
        }
        for(int row = 1; row < locationsStart.length-1; row++){
            for(int col = 1; col < locationsStart[0].length-1; col++){
                locationsStart[row][col] = "_A0O0L0SN";
                locationsEnd[row][col] = "_A0O0L0SN";
            }
        }

        //generate fruit location
        int randomRow = 1 + (int)(Math.random() * (locationsStart.length-3));
        int randomCol = 1 + (int)(Math.random() * (locationsStart[0].length-2));

        //place fruit and myrtles
        locationsStart[randomRow][randomCol] = "_A1O1L1SN";
        locationsStart[locationsStart.length-2][1] = "_A0O0L0SMEA0O0L0S";
        locationsEnd[randomRow][randomCol] = "_A1O1L1SMEA0O0L0S";

        String [] stringMapStart = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsStart[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapStart[row] = nextLine;
        }
        String [] stringMapEnd = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsEnd[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapEnd[row] = nextLine;
        }

        System.out.println("Testing search for fruit");
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).setDelayMove(50);
        theMyrtles.get(0).setDelayPlacement(10);
        theMyrtles.get(0).searchForFruit();
        if(doMapsMatch(mapStart, mapEnd, true)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testPlaceSpiral(){
        theMyrtles = new ArrayList<Myrtle>();

        int size = 20;
        int halfSize = size/2;
        //initialize temp maps
        String [][] locationsStart = new String[size][size];
        String [][] locationsEnd = new String[size][size];
        for(int row = 0; row < locationsStart.length; row++){
            locationsStart[row][0] = "XA0O0L0SN";
            locationsStart[row][locationsStart[row].length-1] = "XA0O0L0SN";
            locationsEnd[row][0] = "XA0O0L0SN";
            locationsEnd[row][locationsStart[row].length-1] = "XA0O0L0SN";
        }
        for(int col = 0; col < locationsStart[0].length; col++){
            locationsStart[0][col] = "XA0O0L0SN";
            locationsStart[locationsStart.length-1][col] = "XA0O0L0SN";
            locationsEnd[0][col] = "XA0O0L0SN";
            locationsEnd[locationsStart.length-1][col] = "XA0O0L0SN";
        }
        for(int row = 1; row < locationsStart.length-1; row++){
            for(int col = 1; col < locationsStart[0].length-1; col++){
                locationsStart[row][col] = "_A0O0L0SN";
                locationsEnd[row][col] = "_A0O0L0SN";
            }
        }

        locationsStart[halfSize][halfSize] = "_A0O0L0SMEA999O999L999S";
        //place fruit and myrtles
        int randomNumSides = 2 + (int)(Math.random() * 14);
        int rowS = halfSize;
        int colS = halfSize;
        int sideLength = 1;
        char direction = 'E';
        for(int n = 1; n <= randomNumSides; n++){
            for(int place = 1; place <= sideLength; place++){
                locationsEnd[rowS][colS] = "_A1O1L1SN";
                if(direction == 'E'){
                    colS++;
                }else if(direction == 'W'){
                    colS--;
                }else if(direction == 'N'){
                    rowS--;
                }else if(direction == 'S'){
                    rowS++;
                }
            }
            sideLength += 1;
            if(direction == 'E'){
                direction = 'N';
            }else if(direction == 'N'){
                direction = 'W';
            }else if(direction == 'W'){
                direction = 'S';
            }else if(direction == 'S'){
                direction = 'E';
            }
        }
        locationsEnd[rowS][colS] = "_A0O0L0SM" + direction + "A0O0L0S";

        String [] stringMapStart = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsStart[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapStart[row] = nextLine;
        }
        String [] stringMapEnd = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsEnd[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapEnd[row] = nextLine;
        }

        System.out.println("Testing place spiral with " + randomNumSides);
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).setDelayMove(50);
        theMyrtles.get(0).setDelayPlacement(10);
        theMyrtles.get(0).placeSpiral(randomNumSides);
        if(doMapsMatch(mapStart, mapEnd, false)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testPlacePyramid(){
        theMyrtles = new ArrayList<Myrtle>();

        int size = 20;
        int halfSize = size/2;
        //initialize temp maps
        String [][] locationsStart = new String[size][size];
        String [][] locationsEnd = new String[size][size];
        for(int row = 0; row < locationsStart.length; row++){
            locationsStart[row][0] = "XA0O0L0SN";
            locationsStart[row][locationsStart[row].length-1] = "XA0O0L0SN";
            locationsEnd[row][0] = "XA0O0L0SN";
            locationsEnd[row][locationsStart[row].length-1] = "XA0O0L0SN";
        }
        for(int col = 0; col < locationsStart[0].length; col++){
            locationsStart[0][col] = "XA0O0L0SN";
            locationsStart[locationsStart.length-1][col] = "XA0O0L0SN";
            locationsEnd[0][col] = "XA0O0L0SN";
            locationsEnd[locationsStart.length-1][col] = "XA0O0L0SN";
        }
        for(int row = 1; row < locationsStart.length-1; row++){
            for(int col = 1; col < locationsStart[0].length-1; col++){
                locationsStart[row][col] = "_A0O0L0SN";
                locationsEnd[row][col] = "_A0O0L0SN";
            }
        }

        //place fruit and myrtles
        locationsStart[size-2][1] = "_A0O0L0SMEA999O999L999S";
        int sideLength = 1 + (int)(Math.random() * (size-3));

        int tempSideLength = sideLength;
        int startingRow = locationsStart.length - 1 - sideLength;
        int startingCol = 1;
        int numFruits = 1;
        while(tempSideLength > 0){
            for(int row = startingRow; row < startingRow + tempSideLength; row++){
                // locationsStart[row][startingCol] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
                // locationsStart[row][startingCol + tempSideLength - 1] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
                locationsEnd[row][startingCol] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
                locationsEnd[row][startingCol + tempSideLength-1] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
            }
            for(int col = startingCol; col < startingCol + tempSideLength; col++){
                // locationsStart[startingRow][col] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
                // locationsStart[startingRow + tempSideLength-1][col] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
                locationsEnd[startingRow][col] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
                locationsEnd[startingRow + tempSideLength-1][col] = "_A" + numFruits + "O" + numFruits + "L" + numFruits + "SN";
            }
            tempSideLength -= 2;
            numFruits += 1;
            startingRow += 1;
            startingCol += 1;
        }

        String [] stringMapStart = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsStart[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapStart[row] = nextLine;
        }
        String [] stringMapEnd = new String[locationsStart.length];
        for(int row = 0; row < locationsStart.length; row++){
            String nextLine = "";
            for(int col = 0; col < locationsStart[0].length; col++){
                nextLine += locationsEnd[row][col] + " ";
            }
            //System.out.println(nextLine);
            stringMapEnd[row] = nextLine;
        }

        System.out.println("Testing place pyramid with side length of " + sideLength);
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).setDelayMove(30);
        theMyrtles.get(0).setDelayPlacement(10);
        theMyrtles.get(0).placePyramid(sideLength);
        if(doMapsMatch(mapStart, mapEnd, false)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testFillMazeWithFruits(){
        theMyrtles = new ArrayList<Myrtle>();
        String [] stringMapStart = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN XA0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN _A0O0L0SMNA9999O9999L9999S XA0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN _A0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        String [] stringMapEnd = {
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN XA0O0L0SN _A1O1L1SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN _A1O1L1SN XA0O0L0SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN _A1O1L1SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN XA0O0L0SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN _A1O1L1SN XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN _A1O1L1SMNA9999O9999L9999S XA0O0L0SN _A1O1L1SN _A1O1L1SN _A1O1L1SN _A1O1L1SN XA0O0L0SN ",
                "XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN XA0O0L0SN ",};
        mapStart = loadMap(stringMapStart, true);
        mapEnd = loadMap(stringMapEnd, false);
        paintImmediately(0,0,1000,1000);
        //System.out.println("Size: " + theMyrtles.size());
        theMyrtles.get(0).setDelayMove(30);
        theMyrtles.get(0).setDelayPlacement(2);
        theMyrtles.get(0).fillMazeWithFruits();
        if(doMapsMatch(mapStart, mapEnd, false)){
            return true;
        }else{
            return false;
        }
    }

    public Block[][] loadMap(String [] stringMap, boolean addMyrtles){
        int spaceCount = 0;
        String line = stringMap[0];
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == ' '){
                spaceCount++;
            }
        }

        Block[][] map = new Block[stringMap.length][spaceCount];

        for(int r = 0; r < map.length; r++){
            String nextLine = stringMap[r];
            //System.out.println(nextLine);
            int index = 0;
            for(int c = 0; c < map[r].length; c++){
                //System.out.println(index + ", " + nextLine.charAt(index) + ", ");
                boolean isWall;
                if(nextLine.charAt(index) == 'X'){
                    isWall = true;
                }else{
                    isWall = false;
                }
                int indexApple = nextLine.indexOf("A", index+1) ;
                int indexOrange = nextLine.indexOf("O", index+1);
                int indexLemon = nextLine.indexOf("L", index+1);
                int indexStop =  nextLine.indexOf("S", index+1);
                int appleCount = Integer.parseInt(nextLine.substring(indexApple+1, indexOrange));
                int orangeCount = Integer.parseInt(nextLine.substring(indexOrange+1, indexLemon));
                int lemonCount = Integer.parseInt(nextLine.substring(indexLemon+1, indexStop));

                Myrtle animal = null;
                index = indexStop+1;
                if(nextLine.charAt(index) == 'M'){
                    char direction = nextLine.charAt(index+1);
                    indexApple = nextLine.indexOf("A", index+2) ;
                    indexOrange = nextLine.indexOf("O", index+2);
                    indexLemon = nextLine.indexOf("L", index+2);
                    indexStop =  nextLine.indexOf("S", index+2);
                    int myrtleAppleCount = Integer.parseInt(nextLine.substring(indexApple+1, indexOrange));
                    int myrtleoOrangeCount = Integer.parseInt(nextLine.substring(indexOrange+1, indexLemon));
                    int myrtleLemonCount = Integer.parseInt(nextLine.substring(indexLemon+1, indexStop));
                    animal = new Myrtle(this, map, direction, r, c, myrtleAppleCount, myrtleoOrangeCount, myrtleLemonCount);
                    if(addMyrtles){
                        //System.out.println("Adding myrtle");
                        theMyrtles.add(animal);
                    }
                    index = indexStop + 2;
                }else{
                    index = index + 2;
                }

                map[r][c] = new Block(isWall, animal, appleCount, orangeCount, lemonCount);

            }
        }
        mapLoaded = true;
        return map;
    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("pressed: " + c);
        if(c == 'y' || c == 'Y'){
            backgroundColor = Color.YELLOW;
        }
        repaint();
        paintImmediately(0,0,1000,1000);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("typed: " + c);

        repaint();
    }

    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("released: " + c);
        backgroundColor = Color.WHITE;
        repaint();
    }

    public void mouseClicked(MouseEvent e){
    }

    public void mouseEntered(MouseEvent e){
    }

    public void mouseExited(MouseEvent e){
    }

    public void mousePressed(MouseEvent e){
    }

    public void mouseReleased(MouseEvent e){
        int x = e.getX() - 4;
        int y = e.getY() - 30;
        System.out.println("X: " + x + '\t' + "Y: " + y);

    }

    public boolean doMapsMatch(Block[][] map1, Block[][] map2, boolean checkMyrtle){
        if(map1.length != map2.length || map1[0].length != map2[0].length){
            return false;
        }
        for(int row = 0; row < map1.length; row++){
            for(int col = 0; col < map1[0].length; col++){
                if(!map1[row][col].equals(map2[row][col], checkMyrtle)){
                    return false;
                }
            }
        }
        return true;
    }

    ////////////////////////////////////////////////////
    //Title:    paint
    //Input:    Graphics object
    //Returns:  nothing
    //Does:     Paints the board to the screen
    public void paint(Graphics g){
        ((Graphics2D)g).setStroke(new BasicStroke(2));

        g.setColor(backgroundColor);
        g.fillRect(0, 0, 2000, 2000);

        // String message = "Hello " + name;

        // g.setFont(new Font("Times New Roman", Font.BOLD, 50));
        // g.setColor(Color.BLACK);
        // g.drawString(message, 300, 75);

        if(mapLoaded){
            for(int r = 0; r < mapStart.length; r++){
                for(int c = 0; c < mapStart[r].length; c++){
                    mapStart[r][c].paint(g, c*blockSize, r*blockSize + blockSize, blockSize);
                    g.setColor(Color.BLACK);
                    g.drawRect(c* blockSize, r*blockSize + blockSize, blockSize, blockSize);
                }
            }

            int yOffSet = mapStart.length * blockSize + 2 * blockSize;
            for(int r = 0; r < mapEnd.length; r++){
                for(int c = 0; c < mapEnd[r].length; c++){
                    mapEnd[r][c].paint(g, c*blockSize, r*blockSize + blockSize + yOffSet, blockSize);
                    g.setColor(Color.BLACK);
                    g.drawRect(c* blockSize, r*blockSize + blockSize + yOffSet, blockSize, blockSize);
                }
            }
        }
    }

    public void run(){
        int delay = 100;
        while(!gameOver){

            System.out.println("Game Running");

            try {
                Thread.sleep(delay);
            }
            catch(InterruptedException e){

            }

            paintImmediately(0,0,1000,1000);
        }
    }

    public static void main(String [] arg){
        JFrame frame = new JFrame("Game");
        MyrtleTester game = new MyrtleTester(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(2000, 2000);
        frame.setLocation(0, 0);
        frame.addKeyListener(game);
        frame.addMouseListener(game);
        frame.getContentPane().add(game);
        frame.setVisible(true);
        frame.requestFocus();
        //game.run();

    }
}