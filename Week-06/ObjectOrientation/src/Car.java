/**
 * Created by Rita on 2016.12.02..
 */
public class Car {
    private int engineSize = 1600;
    private String color = "red";
    private String typeCar = "Mazda";
    private int kmOdometer;

    public Car(int engineSize, String color, String typeCar, int kmOdometer) {
        this.engineSize = engineSize;
        this.color = color;
        this.typeCar = typeCar;
        this.kmOdometer = kmOdometer;
    }

    public Car(String typeCar, String color) {
        this(1600, color, typeCar,10);
    }

    public Car(int engineSize, int kmOdometer) {
        this(engineSize, "red", "Mazda", kmOdometer);
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public String toString() {
        return String.format("This %s is %s, has %d cc engine and clocked %d km's.",
                this.typeCar,
                this.color,
                this.engineSize,
                this.kmOdometer);
    }

    public void drive(int km) {
        this.kmOdometer += km;
        if (km < 20) {
            System.out.printf("Brrm, the %s %s just drove around town %d kms. ",
                    this.color,
                    this.typeCar,
                    km);

        }
        if (km > 20 && km < 50) {
            System.out.printf("Brrm, screech, brrm, screech; %s %s commuted %d clicks. ",
                    this.color,
                    this.typeCar,
                    km);
        } else {
            System.out.printf("Whee, %s %s drove %d kms. ",
                    this.color,
                    this.typeCar,
                    km);
        }
    }


}
