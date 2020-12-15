package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> returnValue = new ArrayList<>();
        returnValue.add(new Bulldozer(30));
        returnValue.add(new Bulldozer(50));
        returnValue.add(new Bulldozer(20));
        return returnValue;
    }
}
