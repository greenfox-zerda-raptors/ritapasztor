import java.util.Random;

/**
 * Created by Rita on 2016.12.05..
 */
public abstract class Character extends GameObject {
    protected String name;
    protected int level;
    protected int maxHealthPoint;
    protected int currentHealthPoint;
    protected int defendPoint;
    protected int strikePoint;
    protected boolean isAlive = true;


    protected Random random = new Random();


    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
        level = 1;
    }

    public void strike(Character attacked) {
        attacked.figth(this);
    }

    public void figth(Character attacker) {

        this.currentHealthPoint -= attacker.strikePoint;
        if (this.currentHealthPoint <= 0) {
            this.setAlive(false);
        }
    }

    public abstract boolean isAtTheSamePlace(Hero hero);

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name +
                ", HP=" + currentHealthPoint +
                ", DP=" + defendPoint +
                ", SP=" + strikePoint;
    }


}
