package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weight;

    public Excavator() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List get() {
        List<Excavator> machine = new ArrayList<>();
        machine.add(new Excavator());
        return machine;
    }
}
