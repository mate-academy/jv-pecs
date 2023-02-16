package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private List<Excavator> excavatorStorage = new ArrayList<>();

    public Excavator() {
    }

    public List<Excavator> readStorage() {
        return excavatorStorage;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void initalizeStorage() {
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
    }
}
