/**
 * Created by Rita on 2016.11.15..
 */
public class Animal {
    int lifeExpectancy;
    boolean isCarnivore;

    public void sleep(){
        System.out.println("animal sleeps");
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }
    public Animal() {
        this.lifeExpectancy = 10;
        this.isCarnivore = false;
    }

  public Animal(int lifeExpectancy, boolean isCarnivore){
            this.lifeExpectancy = lifeExpectancy;
            this.isCarnivore = isCarnivore;
        System.out.println("created an animal");
    }
    public int getLifeExpectancy() {
        System.out.println("created an animal");
        return lifeExpectancy;
    }
    public boolean isCarnivore() {
        System.out.println("created an animal");
        return isCarnivore;
    }

    public Animal(String type){
        System.out.println("Animal is created.");
        System.out.println(type + " animal is created.");
    }
    public void speak() {
        System.out.println("animal speaks");
    }

    public String toString() {
        return String.format ("isCanivore=%b, lifeExpectancy=%d",
                isCarnivore,
                lifeExpectancy);
    }
}
