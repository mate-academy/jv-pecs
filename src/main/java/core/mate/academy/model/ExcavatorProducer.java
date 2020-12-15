package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> returnValue = new ArrayList<>();
        returnValue.add(new Excavator(30));
        returnValue.add(new Excavator(50));
        returnValue.add(new Excavator(20));
        return returnValue;
    }
}
