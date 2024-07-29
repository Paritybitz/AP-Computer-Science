package COW16;


import java.util.*;
public class Puzzler
{
    public void rotateAll(PuzzlePiece [][] thePuzzle){
        for(int n = 0; n < thePuzzle.length; n++){
            for(int i = 0; i < thePuzzle[n].length; i++){
                thePuzzle[n][i].rotateClockwise();
            }
        }
    }

    public void randomlyRotate(PuzzlePiece [][] thePuzzle){
        for(int n = 0; n < thePuzzle.length; n++){
            for(int i = 0; i < thePuzzle[n].length; i++){
                int random = (int)(Math.random() * 4);
                if(random == 0){
                    thePuzzle[n][i].rotateClockwise();
                }else if(random == 1){
                    thePuzzle[n][i].rotateClockwise();
                    thePuzzle[n][i].rotateClockwise();
                }else if (random == 2){
                    thePuzzle[n][i].rotateClockwise();
                    thePuzzle[n][i].rotateClockwise();
                    thePuzzle[n][i].rotateClockwise();
                }else{
                    thePuzzle[n][i].rotateClockwise();
                    thePuzzle[n][i].rotateClockwise();
                    thePuzzle[n][i].rotateClockwise();
                    thePuzzle[n][i].rotateClockwise();
                }
            }
        }
    }

    public void fixRotation(PuzzlePiece [][] thePuzzle){
        for(int col = 0; col < thePuzzle.length*thePuzzle.length; col++){
            while(thePuzzle[0][0].getWest() != -2 || thePuzzle[0][0].getNorth() != -2){
                thePuzzle[0][0].rotateClockwise();
            }
            for(int n = 0; n < thePuzzle.length-1; n++){
                while(thePuzzle[n][0].getSouth() != thePuzzle[n+1][0].getNorth()){
                    thePuzzle[n+1][0].rotateClockwise();
                }
            }

            for(int n = 0; n < thePuzzle.length; n++){
                for(int i = 0; i < thePuzzle[n].length-1; i++){
                    if(thePuzzle[n][i].getEast() != thePuzzle[n][i+1].getWest()){
                        thePuzzle[n][i+1].rotateClockwise();
                    }
                }
            }
        }
    }

    public void randomizeOrder(PuzzlePiece [][] thePuzzle){
        PuzzlePiece temp;
        for(int n = 0; n < thePuzzle.length*thePuzzle[0].length; n++){
            int randomY = (int)(Math.random() * thePuzzle.length);
            int randomX = (int)(Math.random() * thePuzzle[0].length);
            temp = thePuzzle[randomY][randomX];
            int rY = (int)(Math.random() * thePuzzle.length);
            int rX = (int)(Math.random() * thePuzzle[0].length);
            thePuzzle[randomY][randomX] = thePuzzle[rY][rX];
            thePuzzle[rY][rX] = temp;
        }
    }

    public void fixPlacement(PuzzlePiece [][] thePuzzle){
        PuzzlePiece temp=thePuzzle[0][0];//(r,c)
        int row=0;int col=0;
        for(int r=0;r<thePuzzle.length;r+=1){
            boolean thePiece=false;
            for(int c=0;c<thePuzzle[r].length;c+=1){
                if(thePuzzle[r][c].getNorth()==thePuzzle[r][c].getWest()&&thePuzzle[r][c].getNorth()==-2){
                    temp=thePuzzle[r][c];
                    row=r;col=c;c=thePuzzle[r].length;
                    thePiece=true;
                }
            }
            if(thePiece){r=thePuzzle.length;}
        }
        thePuzzle[row][col]=thePuzzle[0][0];
        thePuzzle[0][0]=temp;
        for(int rowIndex=1;rowIndex<thePuzzle.length;rowIndex+=1){
            boolean thePiece=false;
            for(int r=0;r<thePuzzle.length;r+=1){
                thePiece=false;
                for(int c=0;c<thePuzzle[r].length;c+=1){
                    if(thePuzzle[rowIndex-1][0].getSouth()==thePuzzle[r][c].getNorth()){
                        temp=thePuzzle[r][c];
                        row=r;col=c;
                        c=thePuzzle[r].length;
                        thePiece=true;
                    }
                }
                if(thePiece){r=thePuzzle.length;}
            }
            if(thePiece){
                thePuzzle[row][col]=thePuzzle[rowIndex][0];
                thePuzzle[rowIndex][0]=temp;
            }
        }

        for(int rowIndex=0;rowIndex<thePuzzle.length;rowIndex+=1){
            boolean thePiece=false;
            for(int colIndex=0;colIndex<thePuzzle[rowIndex].length-1;colIndex+=1){
                for(int r=rowIndex;r<thePuzzle.length;r+=1){
                    thePiece=false;
                    for(int c=1;c<thePuzzle[r].length;c+=1){
                        if(thePuzzle[rowIndex][colIndex].getEast()==thePuzzle[r][c].getWest()){
                            temp=thePuzzle[r][c];
                            row=r;col=c;
                            c=thePuzzle[r].length;thePiece=true;
                        }
                    }
                    if(thePiece){r=thePuzzle.length;}
                }
                if(thePiece){
                    thePuzzle[row][col]=thePuzzle[rowIndex][colIndex+1];
                    thePuzzle[rowIndex][colIndex+1]=temp;
                }
            }
        }
    }

    public void randomizeCompletely(PuzzlePiece [][] thePuzzle){

    }

    public void solve(PuzzlePiece [][] thePuzzle){

    }

}
