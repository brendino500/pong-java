import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

  GamePanel panel;

  GameFrame() {
    panel = new GamePanel();
    this.add(panel);
    this.setTitle("Pong Game");
    this.setResizable(false);
    this.setBackground(Color.BLACK);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null); // appear in middle of screen
  }
}
