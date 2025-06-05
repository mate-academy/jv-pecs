package core.mate.academy.model.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_GET; i++) {
            excavatorList.add(new Excavator());
        }
        return excavatorList;
    }
}
