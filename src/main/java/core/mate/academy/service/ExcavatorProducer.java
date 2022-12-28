package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorArrayList = new ArrayList<>();
        excavatorArrayList.add(new Excavator(5,3,1));
        return excavatorArrayList;
    }
}
