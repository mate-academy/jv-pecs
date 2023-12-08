package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> objects = new ArrayList<>();
        objects.add(new Excavator());
        objects.add(new Excavator());
        objects.add(new Excavator());
        return objects;
    }
}
