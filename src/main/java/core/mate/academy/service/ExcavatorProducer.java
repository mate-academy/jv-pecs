package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavator1 = new Excavator(125,30);
        Excavator excavator2 = new Excavator(135,40);
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        return excavatorList;
    }
}
