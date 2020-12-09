package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Unity", "brown", 2000));
        list.add(new Excavator("Origins", "yellow", 2500));
        list.add(new Excavator("valhalla", "gray", 1800));
        return list;
    }
}
