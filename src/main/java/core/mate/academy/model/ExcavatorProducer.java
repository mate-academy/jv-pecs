package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorsList = new ArrayList<>();
        excavatorsList.add(new Excavator((int) (Math.random() * 100), "orange", "Clockwork"));
        excavatorsList.add(new Excavator((int) (Math.random() * 100), "golden", "Daisy"));
        excavatorsList.add(new Excavator((int) (Math.random() * 100), "gray", "Kitt"));
        return excavatorsList;
    }
}
