package COW12;

//import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JPanel;

public class Slot
{
    public void spin(){
        randomNumber = (int)(Math.random() * 9) + 1;
    }

    private int randomNumber;
    private String [] fileNames = {"question.jpg","brain.jpg","Strawberry.jpg", "he-man.jpg", "Tummi.jpg", "ThunderCats.jpg", "moon.jpg", "gizmo.jpg", "pony.jpg", "Fozzie.jpg"};
    private Image img;

    public void Slot(){
        randomNumber = (int) (Math.random() * 9) + 1;
    }

    public int getNumber(){
        return randomNumber;
    }


    public void paint(Graphics g, int x, int y) {
        img = (new ImageIcon(fileNames[randomNumber])).getImage();
        g.drawImage(img, x, y, null);
    }


}