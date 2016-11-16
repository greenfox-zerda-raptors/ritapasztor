package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar() {
        this(4);
    }
    public ElectricBassGuitar(int i){
        super(i);
    }
    public void play() {
        System.out.println(formatForPlay, this.name, this.numberOfStrings,"Duum-duum-duum");
    }

}
