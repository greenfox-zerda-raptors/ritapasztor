import java.util.ArrayList;
//Ezzel kezdtem el dolgozni es hatterinfok nelkul vegigmenni, hogy mire lesz szukseg, amikor befejeztem akkor valtok
/**
 * Created by Rita on 2016.11.24..
 */
public class Garden extends ArrayList<Plant> {
    //Garden csak a novenyeket tartalmazza, ezen kivul semmi mast nem fog csinalni
   /* ArrayList<Plant> plants;
    //I need a constructor, because I did not initialize plants above, I need to add below:
    //plants will wait for the ArrayList

    public Garden() {
        plants = new ArrayList<>();
    }*/ //a better solution applied, Garden extends Plants, ArrayList is coming from Plants

    public String water(int amount) { //azert String, mert igy konnyebb lesz kiirni
        int numberOfThirsty = 0; //felveszunk egy valtozot
        for (Plant p : this) { //for ciklus kell, mert minden novenyt meg akarok locsolni. This: azert kell, mert en (garden) vagyok az arraylist
            //megnezni melyik novenyek szomjasak, csak akkor meglocsolni - a plantben fogjuk ezt tarolni
            if (p.isThirsty()) { //alt : enter - field will be created in Plant class
                numberOfThirsty++;
            }
        }
        int waterPerPlant = (int) ((double) amount / numberOfThirsty); //cast: zarojelen belul tizedesjegy is lesz, de int-kent kell majd nekunk
        for (Plant p : this) {
            if (p.isThirsty()) {
                p.water(waterPerPlant);
            }
        }
        return "Watering with " + amount;

    }
    @Override
    public String toString() {
        String result = "";
        for(Plant p : this) {
            result += p.toString() + "\n";
        }
        return result;
    }
}

