/**
 * Created by Rita on 2016.11.24..
 */
public class treee extends Plant {
    public treee(String color) {
        super(color, 0); //tovabbad a super classnak
    }



//    public treee(int waterPerPlant) {
//
//    }
    @Override
    public boolean isThirsty() {
        return currentWaterAmount < 10;
    }

    @Override
    public void water(int waterPerPlant) {
        currentWaterAmount +=(int) ((float)waterPerPlant * 0.4);
    }
}
