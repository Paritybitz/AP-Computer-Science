package COW12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SlotMachine extends JPanel implements ActionListener
{
    public int spinMachine(){
        int prize = 0;

        for (Slot i : slots) {
            i.spin();
        }

        // 3 equal numbers
        if (slots[0].getNumber() == slots[1].getNumber() && slots[1].getNumber() == slots[2].getNumber()) {
            if (slots[0].getNumber() == 9) {
                prize = 10000;
            } else if (slots[0].getNumber() == 1) {
                prize = 0;
            } else {
                prize = slots[0].getNumber() * 10;
            }
        } else {
            // 2 equal numbers
            if (slots[0].getNumber() == slots[1].getNumber() || slots[0].getNumber() == slots[2].getNumber()) {
                prize = slots[0].getNumber() * 5;
            } else if (slots[1].getNumber() == slots[2].getNumber()) {
                prize = slots[1].getNumber() * 5;
            } else {
                // single number
                int max = Math.max(slots[0].getNumber(), Math.max(slots[1].getNumber(), slots[2].getNumber()));
                if (slots[0].getNumber() == 1 || slots[1].getNumber() == 1 || slots[2].getNumber() == 1) {
                    prize = 0;
                } else if (slots[0].getNumber() == 9 || slots[1].getNumber() == 9 || slots[2].getNumber() == 9) {
                    prize = 100;
                } else {
                    prize = max;
                }
            }
        }

        return prize;
    }


    private Button spinButton;
    private Slot[] slots;
    private int amount;

    public SlotMachine(){
        setLayout(null);
        slots = new Slot[3];
        for(int i = 0; i < slots.length; i++){
            slots[i] = new Slot();
        }

        spinButton = new Button("SPIN");
        spinButton.setBounds(0, 350, 600, 100);
        spinButton.setActionCommand("SPIN");
        add(spinButton);
        spinButton.addActionListener(this);
    }



    public void actionPerformed (ActionEvent event){

        String action = event.getActionCommand();

        if("SPIN".equals(action)){
            amount = spinMachine();
        }
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New", Font.BOLD, 60));
        for(int i = 0; i < slots.length; i++){
            slots[i].paint(g, i * 200, 0);
            g.setColor(Color.WHITE);
            String value = "" + slots[i].getNumber();
            g.drawString(value, i * 200 + 90, 345);
        }
        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 300);
        g.drawLine(400, 0, 400, 300);
        g.setColor(Color.YELLOW);
        String winnings = "$$ " + amount + " $$";
        g.drawString(winnings, 150, 500);
    }

    public static void main(String [] arg){
        JFrame frame;

        frame = new JFrame("Slot Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(615, 600);
        frame.setLocation(0, 0);

        SlotMachine gMan = new SlotMachine();

        frame.getContentPane().add(gMan);
        frame.setVisible(true);
    }
}