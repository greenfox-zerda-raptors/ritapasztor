import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Rita on 2016.12.05..
 */
public class Board extends JComponent implements KeyListener {

    boolean[][] map = new boolean[][]{
            {false, false, false, true, true, true, false, true, false, false},
            {false, false, true, true, true, false, false, false, false, true},
            {false, true, false, false, false, true, false, true, true, true},
            {false, false, false, true, true, true, false, true, false, false},
            {true, true, false, true, false, false, false, true, false, false},
            {false, true, false, true, false, true, false, false, false, true},
            {false, true, false, true, false, true, true, false, false, true},
            {false, false, false, false, false, true, false, true, false, true},
            {false, true, true, true, false, true, false, true, false, true},
            {true, true, false, false, false, false, false, true, false, true},
    };

    ArrayList<GameObject> gameObjects;
    Hero hero;
    Skeleton skeleton1;
    Skeleton skeleton2;
    Skeleton skeleton3;
    Boss boss;
    BufferedImage upImage;
    BufferedImage downImage;
    BufferedImage leftImage;
    BufferedImage rightImage;

    ArrayList<Character> enemies;


    public Board() {
        gameObjects = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j]) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
            //set the size of your draw board
            setPreferredSize(new Dimension(520, 650));
            setVisible(true);

        }
        hero = new Hero();
        skeleton1 = new Skeleton(7, 6, "Aze");
        skeleton2 = new Skeleton(0, 8, "Eric");
        skeleton3 = new Skeleton(8, 0, "Misi");
        boss = new Boss();

        this.addKeyListener(this);

        enemies = new ArrayList<>(Arrays.asList(boss, skeleton1, skeleton2, skeleton3));

        try {
            upImage = ImageIO.read(new File("hero-up.png"));
            downImage = ImageIO.read(new File("hero-down.png"));
            rightImage = ImageIO.read(new File("hero-right.png"));
            leftImage = ImageIO.read(new File("hero-left.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.gray);
        graphics.fillRect(0, 0, 720, 720);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }

        graphics.setColor(Color.black);

        if (skeleton1.isAlive) {
            skeleton1.draw(graphics);
            if (skeleton1.isFighting(hero)) {
                graphics.drawString(skeleton1.toString(), 20, 600);
            }
        }
        if (skeleton2.isAlive) {
            skeleton2.draw(graphics);
            if (skeleton2.isFighting(hero)) {
                graphics.drawString(skeleton2.toString(), 20, 600);
            }
        }
        if (skeleton3.isAlive) {
            skeleton3.draw(graphics);
            if (skeleton3.isFighting(hero)) {
                graphics.drawString(skeleton3.toString(), 20, 600);
            }
        }
        if (boss.isAlive) {
            boss.draw(graphics);
            if (boss.isFighting(hero)) {
                graphics.drawString(boss.toString(), 20, 600);
            }
        }
        hero.draw(graphics);
        graphics.drawString(hero.toString(), 20, 560);
    }

    //KeyListener for arrows
    @Override
    public void keyTyped(KeyEvent e) {
        //not needed here
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.setImage(upImage);
            hero.move(0, -1, map);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.setImage(downImage);
            hero.move(0, 1, map);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.setImage(leftImage);
            hero.move(-1, 0, map);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.setImage(rightImage);
            hero.move(1, 0, map);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            for (Character monster : enemies) {
                if (monster.isFighting(hero)) {
                    hero.strike(monster);
                }
            }
        }

        paint(getGraphics());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //not needed here
    }


}

