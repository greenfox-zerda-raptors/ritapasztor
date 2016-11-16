/**
 * Created by Rita on 2016.11.15..
 */
public class Dog extends Animal {
    boolean hasTail;

    public Dog(){
        super(15, true);
    }

    public void speak() {
        System.out.println("animal barks");
    }

    public void beg() {
        System.out.println("begs");
    }

    public boolean getHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
