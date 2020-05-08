import javax.swing.*;
import java.awt.*;

public class MoveBall {
    JFrame frame;
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        MoveBall mb = new MoveBall();
        mb.go();
    }

    public void go() {
        // move ball
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            panel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {
            }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.blue);
            g.fillOval(x, y, 40, 40);
        }
    }


}
