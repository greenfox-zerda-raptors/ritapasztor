package main.java.music;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.lang.model.element.NestingKind;

/**
 * Created by Rita on 2016.11.16..
 */
abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    protected final String formatForPlay ="%s, a %d-stringed instrument that %s.\n";
    public abstract void play();

    public StringedInstrument() {
        super();
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

}
