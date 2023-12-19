package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(1991, "Carpathians"));
        excavatorList.add(new Excavator(1999, "Dynpro"));
        excavatorList.add(new Excavator(2007, "Poltava"));
        return excavatorList;
    }
}
