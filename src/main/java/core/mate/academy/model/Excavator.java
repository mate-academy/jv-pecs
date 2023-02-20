package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class Excavator extends Machine implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Excavator> get() {
        excavators.add(new Excavator());
        return excavators;
    }
}
