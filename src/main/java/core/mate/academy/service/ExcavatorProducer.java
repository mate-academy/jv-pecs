package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavatorList = new ArrayList<>();

    public ExcavatorProducer() {
        excavatorList.add(
                new Excavator("320-07A Next Gen", "green", "CATERPILLAR", 45, 0.3, 3.1));
        excavatorList.add(new Excavator());
        excavatorList.add(new Excavator());
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
