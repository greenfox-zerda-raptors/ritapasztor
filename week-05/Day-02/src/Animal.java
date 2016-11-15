/**
 * Created by Rita on 2016.11.15..
 */
public class Animal {
    public void sleep(){
        System.out.println("Animal is sleeping.");
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }
    public Animal(){
        System.out.println("Animal is created.");
    }
    public Animal(String type){
        System.out.println("Animal is created.");
        System.out.println(type + " animal is created.");
    }
}
