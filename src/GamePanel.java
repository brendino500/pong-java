import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  static final int GAME_WIDTH = 1000;
  static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
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
    newPaddles();
    newBall();
    score = new Score(GAME_WIDTH, GAME_HEIGHT);
    this.setFocusable(true);
    this.addKeyListener(new AL()); // interclass. Extends key adapter class
    this.setPreferredSize(SCREEN_SIZE);

    gameThread = new Thread(this);
    gameThread.start();
  }

  public void newBall() {

  }

  public void newPaddles() {
    paddle1 = new Paddle(0, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 1);
    paddle2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH,
        PADDLE_HEIGHT, 2);
  }

  public void paint(Graphics g) {
    image = createImage(getWidth(), getHeight());
    graphics = image.getGraphics();
    draw(graphics);
    g.drawImage(image, 0, 0, this);
  }

  public void draw(Graphics g) {

  }

  public void move() {

  }

  public void checkCollision() {

  }

  public void run() {
    // game loop
    long lastTime = System.nanoTime();
    double amountOfTicks = 60.0;
    double ns = 1000000000 / amountOfTicks;
    double delta = 0;
    while (true) {
      long now = System.nanoTime();
      delta += (now - lastTime) / ns;
      lastTime = now;
      if (delta >= 1) {
        move();
        checkCollision();
        repaint();
        delta--;
        System.out.println("TEST");
      }
    }

  }

  // action listener
  public class AL extends KeyAdapter {
    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
  }
}
