/**
 * Created by Rita on 2016.12.05..
 */
public class Boss extends Character {

    public Boss() {
        this("boss.png", 8, 8);
    }


    public Boss(String filename, int posX, int posY) {
        super("boss.png", posX, posY);
        int d6 = random.nextInt(6) + 1;
        currentHealthPoint = 2 * level * d6 + d6;
        defendPoint = level / 2 * d6 + (d6 / 2);
        strikePoint = level * d6 + level;
        name = "Da Boss";

    }

    @Override
    public void strike() {

    }
}
