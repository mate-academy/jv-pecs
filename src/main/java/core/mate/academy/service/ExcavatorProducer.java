package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list = new ArrayList<>();

    public List<Excavator> get() {
        list.add(new Excavator("Vodocanal", 30));
        list.add(new Excavator("City", 40));
        list.add(new Excavator("My", 50));
        return list;
    }
}
