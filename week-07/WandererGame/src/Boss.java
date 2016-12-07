/**
 * Created by Rita on 2016.12.05..
 */
public class Boss extends Character {

    public Boss() {
        this("boss.png", 8, 8);
    }


    public Boss(String filename, int posX, int posY) {
        super("boss.png", posX, posY);
    }

    @Override
    public void strike() {

    }
}
