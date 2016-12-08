/**
 * Created by Rita on 2016.12.05..
 */
public class Skeleton extends Character {

    public Skeleton(int posX, int posY, String name) {
        super("skeleton.png", posX, posY);
        int d6 = random.nextInt(6) + 1;
        currentHealthPoint = 2 * level * d6;
        defendPoint = level / 2 * d6;
        strikePoint = level * d6;
        this.name = name;
    }

    @Override
    public void strike() {

    }
}
