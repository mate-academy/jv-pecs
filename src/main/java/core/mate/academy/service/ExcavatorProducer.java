package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> listExcavators;

    public ExcavatorProducer() {
        listExcavators = new ArrayList<>();
        listExcavators.add(new Excavator("Caterpillar 6090 FS", "yellow", 1000, 2250));
        listExcavators.add(new Excavator("Bucyrus RH400", "yellow", 980, 2250));
        listExcavators.add(new Excavator("Hitachi EX8000-6", "yellow", 837, 1944));
    }

    @Override
    public List<Excavator> get() {
        return listExcavators;
    }
}
