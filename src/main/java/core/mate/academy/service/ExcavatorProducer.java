package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        return fillList(excavators);
    }

    private List<Excavator> fillList(List<Excavator> list) {
        list.add(new Excavator("1", "red",100));
        list.add(new Excavator("2", "blue",200));
        list.add(new Excavator("3", "yellow",300));
        list.add(new Excavator("4", "green",400));
        list.add(new Excavator("5", "orange",500));
        return list;
    }
}
