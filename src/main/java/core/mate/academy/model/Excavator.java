package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int loadingHeight;
    private List<Excavator> listOfExcavators = new ArrayList<>();

    public Excavator() {
    }

    public Excavator(String name, String color, int loadingHeight) {
        super(name, color);
        this.loadingHeight = loadingHeight;
    }

    public int getLoadingHeight() {
        return loadingHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Excavator> get() {
        ExcavatorSupplier excavator = new ExcavatorSupplier();
        for (int i = 0; i < 4; i++) {
            listOfExcavators.add(excavator.getExcavator());
        }
        return listOfExcavators;
    }
}
