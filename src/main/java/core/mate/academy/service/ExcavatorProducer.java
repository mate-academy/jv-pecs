package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("JCB3CX", "yellow", 2007, "Bioswale"));
        list.add(new Excavator("JCB2CX", "red", 2006, "Bigdata"));
        list.add(new Excavator("JCB1CX", "orange", 2005, "Climatic"));
        return list;
    }
}
