package main;

/**
 * Created by Rita on 2016.12.01..
 */
public class Mouse extends AbstractAnimal {

    public Mouse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 2;
    }
}
