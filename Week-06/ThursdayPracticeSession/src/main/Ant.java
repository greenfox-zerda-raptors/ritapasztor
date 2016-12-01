package main;

/**
 * Created by Rita on 2016.12.01..
 */
public class Ant implements Animal{
    protected int movedDistance = 0;
    protected int feedCounter = 0;

    @Override
    public void move(int distance) {
        this.movedDistance += distance /2;
    }

    @Override
    public void feed() {
        this.feedCounter += 1;
    }

    @Override
    public String toString() {
        return "Ant{" +
                "movedDistance=" + movedDistance +
                ", feedCounter=" + feedCounter +
                '}';
    }
}
