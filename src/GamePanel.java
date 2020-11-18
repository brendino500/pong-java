import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  static final int GAME_WIDTH = 1000;
  static final int GAME_HEIGHT = (int) (GAME_WIDTH * (5 / 9));
  static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
  static final int BALL_DIAMETER = 20;
  static final int PADDLE_WIDTH = 25;
  static final int PADDLE_HEIGHT = 100;
  Thread gameThread;
  Image image;
  Graphics graphics;
  Random random;
  Paddle paddle1;
  Paddle paddle2;
  Ball ball;
  Score score;

  GamePanel() {

  }

  public void newBall() {

  }

  public void newPaddles() {

  }

  public void paint(Graphics g) {

  }

  public void draw(Graphics g) {

  }

  public void move() {

  }

  public void checkCollision() {

  }

  public void run() {

  }

  // action listener
  public class AL extends KeyAdapter {
    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
  }
}
