package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> resultBulldozer = new ArrayList<>();
        resultBulldozer.add(new Excavator("Red", 133, 5));
        resultBulldozer.add(new Excavator("Yellow", 234, 6));
        resultBulldozer.add(new Excavator("White", 322, 7));
        return resultBulldozer;
    }
}
