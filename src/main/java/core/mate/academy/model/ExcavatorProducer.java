package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();
    private Excavator first;
    private Excavator second;
    private Excavator third;

    @Override
    public List<Excavator> get() {
        first = new Excavator();
        first.setName("K-34");
        first.setColor("Black");
        first.setTypeOfMovement("Wheels");
        first.setLastDriverName("Petrovich");
        second = new Excavator();
        second.setName("K-56m");
        second.setColor("Green");
        second.setTypeOfMovement("Caterpillar");
        second.setLastDriverName("Tihon");
        third = new Excavator();
        third.setName("K-77");
        third.setColor("Yellow");
        third.setTypeOfMovement("Wheels");
        third.setLastDriverName("Vasya");
        excavators.add(first);
        excavators.add(second);
        excavators.add(third);
        return excavators;
    }
}
