package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> returnValue = new ArrayList<>();
        returnValue.add(new Bulldozer(30));
        returnValue.add(new Bulldozer(50));
        returnValue.add(new Bulldozer(20));
        return returnValue;
    }
}
