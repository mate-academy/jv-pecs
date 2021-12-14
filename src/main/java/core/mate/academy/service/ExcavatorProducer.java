package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setId(1);
        excavator1.setModel("3cx");

        Excavator excavator2 = new Excavator();
        excavator2.setId(2);
        excavator2.setModel("4cx");

        List<Machine> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);

        return excavators;
    }
}
