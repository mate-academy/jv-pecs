package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int DEFAULT_DEGREE_OF_FREEDOM = 5;
    private static final double DEFAULT_MAX_LIFT_HEIGHT = 12d;
    private final List<Excavator> excavatorList;

    public ExcavatorProducer() {
        this.excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(DEFAULT_DEGREE_OF_FREEDOM, DEFAULT_MAX_LIFT_HEIGHT));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
