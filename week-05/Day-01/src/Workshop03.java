import javax.sound.midi.Soundbank;

/**
 * Created by Rita on 2016.11.14..
 */
public class Workshop03 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("red");
        myCar.setEngineSize(1600);
        myCar.setTypeCar("Mazda");
        myCar.setKmOdometer(12312);

        Car myCar2 = new Car();
        myCar2.setColor("silver");
        myCar2.setEngineSize(2500);
        myCar2.setTypeCar("Ford");
        myCar2.setKmOdometer(152312);

        Car myCar3 = new Car();
        myCar3.setColor("green");
        myCar3.setEngineSize(2800);
        myCar3.setTypeCar("Beamer");
        myCar3.setKmOdometer(42521);

        //myCar.drive(15);
        System.out.println(myCar.toString());

        System.out.println();
        //myCar2.drive(49);
        System.out.println(myCar2.toString());

        System.out.println();
        //myCar3.drive(1200);
        System.out.println(myCar3.toString());

        System.out.println();
        Car myCar4 = new Car();
        System.out.println(myCar4.toString());

        System.out.println();
        Car myCar5 = new Car("Opel", "white", 1400, 25);
        System.out.println(myCar5.toString());

        System.out.println();
        Car myCar6 = new Car("VW","grey");
        System.out.println(myCar6.toString());

        System.out.println();
        Car myCar7 = new Car(1100, 15);
        System.out.println(myCar7.toString());
    }
}
