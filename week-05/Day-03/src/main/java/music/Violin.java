package main.java.music;

/**
 * Created by Rita on 2016.11.16..
 */
public class Violin extends StringedInstrument {

    public Violin() {
        this(4);
    }
    public Violin(int i) {
        super(i);
    }

    public void play(){
        System.out.println(formatForPlay, this.name, this.numberOfStrings, "Screech");
    }
}
