package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Cat 330", "yellow"));
        list.add(new Excavator("John Deere E260 LC", "yellow"));
        return list;
    }
}
