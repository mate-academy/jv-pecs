package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("atlas", "black", 10, 10, "crawler"));
        excavatorList.add(new Excavator("hydrema", "white", 15, 15, "compact"));
        excavatorList.add(new Excavator("hitachi", "yellow", 20, 20, "long"));
        return excavatorList;
    }
}
