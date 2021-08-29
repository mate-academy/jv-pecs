package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> listExcavator = new ArrayList<>();
        listExcavator.add(new Excavator("exc1", "red", 4));
        listExcavator.add(new Excavator("exc2", "green", 6));
        return listExcavator;
    }
}
