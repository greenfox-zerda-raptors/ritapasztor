import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Rita on 2016.12.05..
 */
public class Board extends JComponent {

    boolean[][] map = new boolean[][]{
            {false, false, false, true, true, true, false, true, false, false},
            {false, false, true, true, true, false, false, false, false, true},
            {false, true, false, false, false, true, false, true, true, true},
            {false, false, false, true, true, true, false, true, false, true},
            {true, true, false, true, false, false, false, true, false, true},
            {false, true, false, true, false, true, false, false, true, true},
            {false, true, false, true, false, true, true, false, false, true},
            {false, false, false, false, false, true, false, true, false, true},
            {false,true, true, false, false, true, false, true, false, true},
            {false, true, false, false, false, true, false, true, false, true},
    };

    ArrayList<GameObject> gameObjects; //tile will be gameObject, because hero is a tile as well
    Hero hero;


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
    }

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
        hero.draw(graphics);

    }
}


//        PositionedImage image2 = new PositionedImage("floor.png", 200, 100);
//        image2.draw(graphics);
//        PositionedImage image3 = new PositionedImage("floor.png", 100, 100);
//        image3.draw(graphics);


