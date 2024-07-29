package COW16;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

public class PuzzlePiece
{
    private BufferedImage picture;
    private int [] sideKeys;

    public PuzzlePiece(BufferedImage picture, int [] sideKeys){
        this.picture = picture;
        this.sideKeys = sideKeys;
    }

    public int getEast(){
        return sideKeys[0];
    }

    public int getNorth(){
        return sideKeys[1];
    }

    public int getWest(){
        return sideKeys[2];
    }

    public int getSouth(){
        return sideKeys[3];
    }

    public void paint(Graphics g, int x, int y){
        g.drawImage(picture, x, y, null);
        /*
        g.setColor(Color.WHITE);
        String description = "x  " + sideKeys[1] + "  x";
        g.drawString(description, x, y + 10);
        description = sideKeys[2] + "  -  " + sideKeys[0];
        g.drawString(description, x, y + 20);
        description = "x  " + sideKeys[3] + "  x";
        g.drawString(description, x, y + 30);
        */
    }

    public void rotateCounterClockwise(){
        int temp = sideKeys[0];
    }

    public void rotateClockwise(){
        int temp = sideKeys[0];
        for(int i = 0; i < sideKeys.length - 1; i++){
            sideKeys[i] = sideKeys[i+1];
        }
        sideKeys[sideKeys.length-1] = temp;

        AffineTransform tx = new AffineTransform();
        tx.rotate(Math.toRadians(90), picture.getWidth() / 2, picture.getHeight() / 2);

        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        picture = op.filter(picture, null);
    }
}
