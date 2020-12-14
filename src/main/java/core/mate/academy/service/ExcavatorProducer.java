package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        Excavator excavator1 = new Excavator("Excavator 1", "Blue", 300, 100, "Type 1");
        Excavator excavator2 = new Excavator("Excavator 2", "Yellow", 200, 120, "Type 2");
        Excavator excavator3 = new Excavator("Excavator 3", "Orange", 400, 150, "Type 3");

        List<Machine> excavatorList = List.of(excavator1, excavator2, excavator3);

        return excavatorList;
    }
}
