package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("JCB 4CX", "yellow", 12345));
        excavatorList.add(new Excavator("Hyundai R300", "yellow", 14552));
        excavatorList.add((new Excavator("Amkodor EO3223", "yellow", 16745)));
        return excavatorList;
    }
}
