/**
 * Created by Rita on 2016.11.14..
 */
public class Workshop02 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.engineSize = 1600;
        myCar.typeCar = "Mazda";
        myCar.kmOdometer = 12312;

        Car myCar2 = new Car();
        myCar2.color = "silver";
        myCar2.engineSize = 2500;
        myCar2.typeCar = "Ford";
        myCar2.kmOdometer = 152312;

        Car myCar3 = new Car();
        myCar3.color = "green";
        myCar3.engineSize = 2800;
        myCar3.typeCar = "Beamer";
        myCar3.kmOdometer = 42521;

        System.out.printf("This %s is %s, has %s cc engine and clocked %s km's.\n", myCar.getTypeCar(), myCar.getColor(), myCar.getEngineSize(), myCar.getKmOdometer());
        System.out.printf("This %s is %s, has %s cc engine and clocked %s km's.\n", myCar2.getTypeCar(), myCar2.getColor(), myCar2.getEngineSize(), myCar2.getKmOdometer());
        System.out.printf("This %s is %s, has %s cc engine and clocked %s km's.\n", myCar3.getTypeCar(), myCar3.getColor(), myCar3.getEngineSize(), myCar3.getKmOdometer());

    }
}
