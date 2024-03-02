package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements MachineProducer<Machine> {

    public Excavator() {
    }

    @Override
    public List<Machine> get() {
        List<Machine> excavator = new ArrayList<>();
        excavator.add(new Excavator());
        return excavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
