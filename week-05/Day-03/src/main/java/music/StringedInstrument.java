package main.java.music;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.lang.model.element.NestingKind;

/**
 * Created by Rita on 2016.11.16..
 */
abstract class StringedInstrument extends Instrument { //until you create an implementation for the abstract
    protected int numberOfStrings;
    protected final String formatForPlay ="%s, a %d-stringed instrument that %s.\n";


    public StringedInstrument(String name, int numberOfStrings) { //you can have the parameters in in one constructor
        super(name);
        this.numberOfStrings = numberOfStrings;
    }
    @Override //you can keep this here, as all the parameters has to be
    public void play(){
        System.out.printf(formatForPlay, name, numberOfStrings, sound());
    }

//    public StringedInstrument() { //you need to fill in the constructor of the superclass
//        super();
//    }

//    public StringedInstrument(int numberOfStrings) {
//        this.numberOfStrings = numberOfStrings;
//    }

}
