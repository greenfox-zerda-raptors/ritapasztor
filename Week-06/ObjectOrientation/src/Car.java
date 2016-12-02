/**
 * Created by Rita on 2016.12.02..
 */
public class Car {
    int engineSize = 1600;
    String color = "red";
    String typeCar = "Mazda";
    int kmOdometer;

    public Car(int engineSize, String color, String typeCar, int kmOdometer) {
        this.engineSize = engineSize;
        this.color = color;
        this.typeCar = typeCar;
        this.kmOdometer = kmOdometer;
    }

    public String toString() {
        return String.format("This %s is %s, has %d cc engine and clocked %d km's.",
                this.typeCar,
                this.color,
                this.engineSize,
                this.kmOdometer);
    }
}
