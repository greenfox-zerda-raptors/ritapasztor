package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rita on 2016.12.01..
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Horse("Paci"));
        animals.add(new Horse("Saci"));
        animals.add(new Horse("Paca"));
        animals.add(new Horse("Cic"));
        animals.add(new Horse("Rudy"));
        animals.add(new Horse("Siccc"));
        animals.add(new Ant());

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Iterator<Animal> iterator = animals.iterator();
        /*Animal animal = iterator.next();
        System.out.println("Iterator: " + animal);
        animal = iterator.next();
        System.out.println("Iterator: " + animal);*/ //bele lehet tenni egy loop-ba, h mukodjon

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }

        iterator = animals.iterator();
        for (int i = 0; i < 3; i++) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }
        System.out.println("We're doing something else");

        while(iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }

    }
}
