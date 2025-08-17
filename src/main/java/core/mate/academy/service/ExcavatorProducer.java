package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> output = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            output.add(new Excavator((i + 1) * 5));
        }
        return output;
    }
}
