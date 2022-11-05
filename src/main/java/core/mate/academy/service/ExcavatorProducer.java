package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(100_00,"Crawler excavator");
        excavator1.setName("Excavator-1");
        excavator1.setColor("Blue");
        excavators.add(excavator1);
        Excavator excavator2 = new Excavator(75_000,"Long-reach excavator");
        excavator2.setName("Excavator-2");
        excavator2.setColor("Yellow");
        excavators.add(excavator2);
        Excavator excavator3 = new Excavator(60_000,"Wheeled excavator");
        excavator3.setName("Excavator-3");
        excavator2.setColor("White");
        return excavators;
    }
}
