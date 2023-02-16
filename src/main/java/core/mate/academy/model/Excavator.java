package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Excavator> get() {
        List<Excavator> excavator = new ArrayList<>();
        excavator.add(new Excavator());
        excavator.add(new Excavator());
        excavator.add(new Excavator());
        return excavator;
    }
}
