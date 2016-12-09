/**
 * Created by Rita on 2016.12.05..
 */
public class Skeleton extends Character {

    public Skeleton(int posX, int posY, String name) {
        super("skeleton.png", posX, posY);
        int d6 = random.nextInt(6) + 1;
        currentHealthPoint = 2 * level * d6;
        maxHealthPoint = 2 * level * d6;
        defendPoint = level / 2 * d6;
        strikePoint = level * d6;
        this.name = name;
    }

    @Override
    public boolean isAtTheSamePlace(Hero hero) {
        if (hero.posX == this.posX && hero.posY == this.posY) {
            System.out.println(getClass().getSimpleName() + " van harc");
            return true;
        }
        return false;
    }
}
