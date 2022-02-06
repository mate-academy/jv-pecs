package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Богатырь-300", "yellow", 300));
        excavatorList.add(new Excavator("TTY-15", "red", 150));
        excavatorList.add(new Excavator("GG226Y1", "yellow", 1500));
        return excavatorList;
    }
}
