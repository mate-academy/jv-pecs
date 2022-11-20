package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private List<Machine> list = new ArrayList<>();

    public List<Machine> get() {
        list.add(new Excavator("Vodocanal", 30));
        list.add(new Excavator("City", 40));
        list.add(new Excavator("My", 50));
        return list;
    }
}
