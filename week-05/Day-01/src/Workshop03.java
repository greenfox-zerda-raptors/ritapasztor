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

        myCar.drive(15);
        System.out.printf("This %s is %s, has %s cc engine and clocked %s km's.\n", myCar.getTypeCar(), myCar.getColor(), myCar.getEngineSize(), myCar.getKmOdometer());
        System.out.println();
        myCar2.drive(49);
        System.out.printf("This %s is %s, has %s cc engine and clocked %s km's.\n", myCar2.getTypeCar(), myCar2.getColor(), myCar2.getEngineSize(), myCar2.getKmOdometer());
        System.out.println();
        myCar3.drive(1200);
        System.out.printf("This %s is %s, has %s cc engine and clocked %s km's.\n", myCar3.getTypeCar(), myCar3.getColor(), myCar3.getEngineSize(), myCar3.getKmOdometer());

    }
}
