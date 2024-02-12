package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(157,189,"Excavator1","Black"));
        excavatorList.add(new Excavator(236,431,"Excavator2","Grey"));
        return excavatorList;
    }
}
