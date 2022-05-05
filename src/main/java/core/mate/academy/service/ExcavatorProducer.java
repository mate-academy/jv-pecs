package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavator1 = new Excavator();
        excavator1.setLaddleVolume(100);
        Excavator excavator2 = new Excavator();
        excavator2.setLaddleVolume(150);
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
