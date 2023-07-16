package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(1991, "Карпати"));
        excavatorList.add(new Excavator(1999, "Дніпро"));
        excavatorList.add(new Excavator(2007, "Полтава"));
        return excavatorList;
    }
}
