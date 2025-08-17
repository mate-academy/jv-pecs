package core.mate.academy.service.machineproducerimpl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MAX_EXCAVATOR_QUANTITY = 5;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorsPark = new ArrayList<>();
        for (int i = 0; i < MAX_EXCAVATOR_QUANTITY; i++) {
            excavatorsPark.add(new Excavator());
        }
        return excavatorsPark;
    }
}
