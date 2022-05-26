package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Excava1", "red", 50000));
        list.add(new Excavator("Excava2", "green", 55000));
        list.add(new Excavator("Excava3", "orange", 59000));
        return list;
    }
}