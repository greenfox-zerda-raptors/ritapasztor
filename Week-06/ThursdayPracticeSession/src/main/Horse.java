package main;

/**
 * Created by Rita on 2016.12.01..
 */
public class Horse extends AbstractAnimal {
    public Horse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 20;
    }


    /*private int movedDistance = 0;
    private int feedCounter = 0; //ha nem allitom be akkor is 0 lenne

    @Override
    public void move(int distance) {
        this.movedDistance += distance; //kulon is hozzaadhatom
    }

    @Override
    public void feed() {
        this.feedCounter += 20;
    }*/ //addig kellett, amig nem volt extended abstract class, hanem csak interface
}
