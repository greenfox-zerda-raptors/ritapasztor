/**
 * Created by Rita on 2016.12.02..
 */
public class App {
    public static void main(String[] args) {
        Car myCar1 = new Car(1600, "red", "Mazda", 12312);
        Car myCar2 = new Car(2500, "silver", "Ford", 152312);
        Car myCar3 = new Car(2800, "green", "Beamer", 42521);

        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());
    }
}
