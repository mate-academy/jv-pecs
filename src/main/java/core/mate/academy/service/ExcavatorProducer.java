package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> consignment = new ArrayList<>();
        for (int i = PRODUCTION_AMOUNT; i > 0; i--) {
            consignment.add(new Excavator());
        }
        return consignment;
    }
}
