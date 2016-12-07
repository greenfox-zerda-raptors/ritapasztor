/**
 * Created by Rita on 2016.12.05..
 */
public abstract class Character {
    private int healthPoint;
    private int defendPoint;
    private int strikePoint;

    public Character(int healthPoint, int defendPoint, int strikePoint) {
        this.healthPoint = healthPoint;
        this.defendPoint = defendPoint;
        this.strikePoint = strikePoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDefendPoint() {
        return defendPoint;
    }

    public void setDefendPoint(int defendPoint) {
        this.defendPoint = defendPoint;
    }

    public int getStrikePoint() {
        return strikePoint;
    }

    public void setStrikePoint(int strikePoint) {
        this.strikePoint = strikePoint;
    }

    public abstract void strike();


}
