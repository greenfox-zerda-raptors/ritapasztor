package main;

/**
 * Created by Rita on 2016.12.01..
 */
public abstract class AbstractAnimal implements Animal {
    protected int movedDistance = 0;
    protected int feedCounter = 0;
    private String name;
    protected int childrenNum = 0;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() { //kell mert private adatrol van szo
        return name;
    }

    public int getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(int childrenNum) {
        this.childrenNum = childrenNum;
    }

    @Override
    public void move(int distance) {
        this.movedDistance += distance; //kulon is hozzaadhatom a distance-t
    }

    @Override
    public void feed() {
        this.feedCounter += defaultFoodAmount();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + //aktualis classtol elkeri a nevet es kiirja azt
                "movedDistance=" + movedDistance +
                ", feedCounter=" + feedCounter +
                ", name='" + name + '\'' +
                ", childrenNum=" + childrenNum +
                '}';
    }

    abstract int defaultFoodAmount();
}
