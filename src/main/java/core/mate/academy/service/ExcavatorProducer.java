package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Hitachi", "red", 8000));
        excavatorList.add(new Excavator("JCB", "yellow", 9000));
        excavatorList.add(new Excavator("Volvo", "brown", 11000));
        return excavatorList;
    }
}
