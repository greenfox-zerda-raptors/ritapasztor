import java.awt.image.BufferedImage;


/**
 * Created by Rita on 2016.12.05..
 */
public class Hero extends Character {
    String facing;
    BufferedImage downImage;
    BufferedImage leftImage;
    BufferedImage rightImage;


    public Hero() {
        this("hero-down.png", 0, 0);
    }


    public Hero(String filename, int posX, int posY) {
        super("hero-down.png", posX, posY);
    }

    @Override
    public void strike() {

    }

    public void move(int posX, int posY, boolean[][] map) {
        int newPosY = this.posY + posY;
        int newPosX = this.posX + posX;
        if (newPosY < 0 || newPosY == 10 ||
                newPosX < 0 || newPosX == 10) {
            // newPosY = this.posY;
        } else if (map[newPosX][newPosY]) {
        } else {
            this.posY += posY;
            this.posX += posX;
        }
    }
}




