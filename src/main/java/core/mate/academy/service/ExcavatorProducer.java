package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavatorList;

    public ExcavatorProducer() {
        this.excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(5, 12d));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
