import java.awt.*;
import java.lang.*;


/**
 * Created by Rita on 2016.12.05..
 */
public class Hero extends GameObject{
    public Hero(){
        this("hero-down.png", 0, 0);
    };

    public Hero(String filename, int posX, int posY) {
        super("hero-down.png", posX, posY);
    }

}




