package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorMachineProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator(2000, 100);
        Excavator excavatorTwo = new Excavator(1750, 115);
        List<Excavator> excavatorList = new ArrayList<>(2);

        excavatorList.add(excavatorOne);
        excavatorList.add(excavatorTwo);
        return excavatorList;
    }
}
