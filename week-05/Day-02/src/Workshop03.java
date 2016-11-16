/**
 * Created by Rita on 2016.11.15..
 */
public class Workshop03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        System.out.println("new bird");
        Dog dog = new Dog();
        System.out.println("new sleeps");
        System.out.println();

        System.out.println("Testing Animal");
        // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore

        animal.speak();
        animal.sleep();
        animal.getLifeExpectancy();
        animal.isCarnivore();
        System.out.println();

        System.out.println("\nTesting Bird");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore
        bird.speak();
        bird.sleep();
        bird.fly();
        bird.eat();
        bird.getLifeExpectancy();
        bird.isCarnivore();
        System.out.println();

        System.out.println("\nTesting Dog");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        dog.speak();
        dog.sleep();
        dog.beg();
        dog.getHasTail();
        dog.getLifeExpectancy();
        dog.isCarnivore();


        System.out.println("\nTesting Dog2");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        Animal dog2 = new Dog();

        dog2.speak();
        dog2.sleep();
        ((Dog)dog2).beg();
        ((Dog)dog2).getHasTail();
        dog2.getLifeExpectancy();
        dog2.isCarnivore();


        System.out.println("\nTesting Dog 'd'");
        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
    }
}
