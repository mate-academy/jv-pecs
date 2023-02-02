package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> resultExcavator = new ArrayList<>();
        resultExcavator.add(new Excavator("exc1", "e1", 11));
        resultExcavator.add(new Excavator("exc2", "e2", 22));
        resultExcavator.add(new Excavator("exc3", "e3", 33));
        return resultExcavator;
    }
}
