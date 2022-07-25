package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        Excavator Excavator_One = new Excavator("Excavator_One", "white", 111.5);
        Excavator Excavator_Two = new Excavator("Excavator_Two", "yellow", 222.5);
        Excavator Excavator_Three = new Excavator("Excavator_Three", "green", 333.5);
        return List.of(Excavator_One, Excavator_Two, Excavator_Three);
    }
}
