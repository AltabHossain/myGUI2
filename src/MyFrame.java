/*
*
*/

import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setVisible(true);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        ImageIcon backgroundImg = new ImageIcon("levelBg.png");;
        JPanel background, btn;

        super.paint(g);

        background = new JPanel();

        background.setBounds(0, 0, 700, 500);
        background.setOpaque(true);
        add(background);

        JLabel bgLabel = new JLabel(backgroundImg);
        background.add(bgLabel);

        btn = new JPanel(); // sub-panel 1
        btn.add(new JLabel("Panel One", SwingConstants.CENTER));

        //JLabel btnLabel = new JLabel(play);
    }
}
