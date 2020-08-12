package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator newExcavator = new Excavator(1255, 2, "DiDas", true);
        excavatorList.add(newExcavator);
        return excavatorList;
    }
}
