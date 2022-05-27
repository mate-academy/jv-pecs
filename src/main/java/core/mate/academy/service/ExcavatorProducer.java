package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Jcb 4 cx", "yellow", 1_240_000));
        list.add(new Excavator("Komatsu PC12UU-2", "black", 350_000));
        list.add(new Excavator("JCB 8018", "brown", 500_000));
        return list;
    }
}
