package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer extends Excavator implements MachineProducer {
    @Override
    public List<? super Excavator> get() {
        List<Excavator> excavator = new ArrayList<>();
        excavator.add(new Excavator());
        excavator.add(new Excavator(15,"Yellow"));
        return excavator;
    }
}
