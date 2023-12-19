package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list = new ArrayList<>();

    public ExcavatorProducer() {
        list.add(new Excavator("Crawler"));
        list.add(new Excavator("Walking"));
        list.add(new Excavator("Wheel"));
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
