package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator large = new Excavator(900, 17.5);
    private Excavator medium = new Excavator(450, 12.8);
    private Excavator small = new Excavator(100, 8.3);

    @Override
    public List<Excavator> get() {
        return Arrays.asList(large, medium, small);
    }
}
