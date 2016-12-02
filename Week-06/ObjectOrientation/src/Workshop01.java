/**
 * Created by Rita on 2016.12.02..
 */
public class Workshop01 {
    public static void main(String[] args) {
        Car myCar = new Car(2300, "red", "Mazda", 87543);
        Car myCar1 = new Car(1600, "red", "Mazda", 12312);
        Car myCar2 = new Car(2500, "silver", "Ford", 152312);
        Car myCar3 = new Car(2800, "green", "Beamer", 42521);

        System.out.println(myCar.toString());
        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());

        System.out.println();

        myCar.drive(17);
        System.out.println(myCar.toString());
        myCar3.drive(49);
        System.out.println(myCar3.toString());
        myCar2.drive(1200);
        System.out.println(myCar2.toString());

        Car myCar4 = new Car(1400, "white", "Opel", 25);
        Car myCar5 = new Car("VW","grey");
        Car myCar6 = new Car(1100, 15);

        System.out.println();

        System.out.println(myCar4.toString());
        System.out.println(myCar5.toString());
        System.out.println(myCar6.toString());
    }
}
