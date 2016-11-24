/**
 * Created by Rita on 2016.11.24..
 */
public class App {
    public static void main(String... args) {
        Garden garden = new Garden();
        garden.add(new flower("yellow"));
        garden.add(new flower("blue"));
        garden.add(new treee("purple"));
        garden.add(new treee("orange"));
        System.out.println(garden);
        System.out.println(garden.water(40));
        System.out.println(garden);
        System.out.println(garden.water(40));
        System.out.println(garden);


    }
}
