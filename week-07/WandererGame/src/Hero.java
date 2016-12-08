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
        if (newPosY < 0 || newPosY == map.length || map[newPosX][newPosY] == true && newPosX < 0 || newPosX == map.length || map[newPosX][newPosY] == true) {
            // newPosY = this.posY;
        } else {
            this.posY += posY;
            this.posX += posX;
        }
//        if (newPosX < 0 || newPosX == map.length || map[newPosX][newPosY] == true) {
//            // newPosX = this.posX;
//        } else {
//            this.posX += posX;
//        }


        //movebe beadom a boolean [][]-t, es majd ide alulra irom meg a felteteleket


        //merre van fal
    }

    /*public void turn(String facing) {
        if(facing.equals("up")) {
        this.setImage(image);
        } else if (facing.equals("down")) {
            this.setImage(downImage);
        }else if (facing.equals("right")) {
            this.setImage(rightImage);
        } else if (facing.equals("left")) {
            this.setImage(leftImage);
        }
    }*/
}




