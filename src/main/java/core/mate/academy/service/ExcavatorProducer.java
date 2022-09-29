package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        Excavator first = new Excavator(2000, 2020);
        first.setName("Volvo");
        first.setColor("Yellow");
        Excavator second = new Excavator(1800, 2018);
        second.setName("JCB");
        second.setColor("Red");
        Excavator third = new Excavator(1600, 2017);
        third.setName("Deere");
        third.setColor("Yellow");
        return List.of(first, second, third);
    }
}
