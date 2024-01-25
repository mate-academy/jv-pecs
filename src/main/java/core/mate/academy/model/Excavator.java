package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements MachineProducer<Excavator> {
    private String model;

    public Excavator() {
    }

    public Excavator(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("u55-4"));
        excavators.add(new Excavator("kx06-1"));
        return excavators;
    }
}
