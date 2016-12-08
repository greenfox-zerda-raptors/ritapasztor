import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.05..
 */
public class Board extends JComponent implements KeyListener {

    boolean[][] map = new boolean[][]{
            {false, false, false, true, true, true, false, true, false, false},
            {false, false, true, true, true, false, false, false, false, true},
            {false, true, false, false, false, true, false, true, true, true},
            {false, false, false, true, true, true, false, true, false, true},
            {true, true, false, true, false, false, false, true, false, true},
            {false, true, false, true, false, true, false, false, true, true},
            {false, true, false, true, false, true, true, false, false, true},
            {false, false, false, false, false, true, false, true, false, true},
            {false, true, true, false, false, true, false, true, false, true},
            {false, true, false, false, false, true, false, true, false, true},
    };

    ArrayList<GameObject> gameObjects; //tile will be gameObject, because hero is a tile as well
    Hero hero;
    Skeleton skeleton1;
    Skeleton skeleton2;
    Skeleton skeleton3;
    Boss boss;
    BufferedImage upImage;
    BufferedImage downImage;
    BufferedImage leftImage;
    BufferedImage rightImage;


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
            setPreferredSize(new Dimension(720, 720));
            setVisible(true);
        }
        hero = new Hero();
        skeleton1 = new Skeleton(5, 6);
        skeleton2 = new Skeleton(4, 3);
        skeleton3 = new Skeleton(2, 3);
        boss = new Boss();

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
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
        hero.draw(graphics);
        boss.draw(graphics);
        skeleton1.draw(graphics);
        skeleton2.draw(graphics);
        skeleton3.draw(graphics);

    }

    //KeyListener for arrows
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("hajra");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("fel");
            hero.move(0, -1, map);
            hero.setImage(upImage);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("le");
            hero.move(0, 1, map);
            hero.setImage(downImage);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.move(-1, 0, map);
            hero.setImage(leftImage);
            System.out.println("balra");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.move(1, 0, map);
            hero.setImage(rightImage);
            System.out.println("jobbra");
        }
        paint(getGraphics());
        System.out.println("menni fog :)");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("menniFog");
    }
}


//        PositionedImage image2 = new PositionedImage("floor.png", 200, 100);
//        image2.draw(graphics);
//        PositionedImage image3 = new PositionedImage("floor.png", 100, 100);
//        image3.draw(graphics);

