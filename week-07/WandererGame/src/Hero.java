import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.lang.*;


/**
 * Created by Rita on 2016.12.05..
 */
public class Hero extends Character{
    String facing;
    BufferedImage downImage;
    BufferedImage leftImage;
    BufferedImage rightImage;



    public Hero(){
        this("hero-down.png", 0, 0);
    }



    public Hero(String filename, int posX, int posY) {
        super("hero-down.png", posX, posY);
    }

    @Override
    public void strike() {

    }

    public void move(int posX, int posY) {
        int newPosY;
        int newPosX;
        newPosY = this.posY + posY;
        newPosX = this.posX + posX;
        if (newPosY < 0 || newPosY == 10) {
           // newPosY = this.posY;
        } else {
           this.posY += posY;
        }
        if (newPosX < 0 || newPosX == 10) {
           // newPosX = this.posX;
        } else {
            this.posX += posX;
        }
        //movebe beadom a boolean [][]-t, es majd ide alulra irom meg a felteteleket


        //mi a szele

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




