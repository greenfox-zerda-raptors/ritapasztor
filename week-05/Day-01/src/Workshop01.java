/**
 * Created by Rita on 2016.11.14..
 */

public class Workshop01 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.engineSize = 1600;


        System.out.printf("Just got a new Car, it's " + myCar.getColor() + " and has a " + myCar.getEngineSize() + " cc Engine!\n");
    }
}
