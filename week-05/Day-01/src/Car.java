/**
 * Created by Rita on 2016.11.14..
 */
public class Car {
    private String color;
    private int engineSize;
    private String typeCar;
    private int kmOdometer;

    String getColor() {
        return color;
    }

    int getEngineSize() {
        return engineSize;
    }
    String getTypeCar() {
        return typeCar;
    }
    int getKmOdometer() {
        return kmOdometer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }
    public void drive(int kilometer) {
        this.kmOdometer += kilometer;
        if (kilometer <= 20) {
            System.out.println("Brrm, the " + color + " " + typeCar + " just drove around town " + kilometer +" clicks.");
        }else if (kilometer > 20 && kilometer <= 50) {
            System.out.println("Brrm, screech, brrm, screech; the " + color + " " + typeCar + " commuted " + kilometer + " clicks.");
        }else {
            System.out.println("Whee, the " + color + " " + typeCar + " " + kilometer + " clicks.");
        }
        }
    public String toString() {
        return String.format("This %s is %s, has %s cc engine and clocked %s km's.",
                typeCar,
                color,
                engineSize,
                kmOdometer);
    }

    }

