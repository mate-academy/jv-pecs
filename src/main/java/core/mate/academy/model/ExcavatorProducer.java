package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list;

    public ExcavatorProducer() {
        list = new ArrayList<>();
    }

    @Override
    public List<Excavator> get() {
        list.add(new Excavator("Crawler", 10));
        list.add(new Excavator("Wheleed", 2));
        list.add(new Excavator("Walking", 100));
        return list;
    }
}
