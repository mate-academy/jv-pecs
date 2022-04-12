package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private Excavator model = new Excavator();

    @Override
    public List<Excavator> get() {
        List<Excavator> listExcavator = new ArrayList<>();
        listExcavator.add(model);
        return listExcavator;
    }
}
