package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Machine> get() {
        List<Machine> resultExcavator = new ArrayList<>();
        resultExcavator.add(new Excavator("exc1","e1",11));
        resultExcavator.add(new Excavator("exc2","e2",22));
        resultExcavator.add(new Excavator("exc3","e3",33));
        return resultExcavator;
    }
}
