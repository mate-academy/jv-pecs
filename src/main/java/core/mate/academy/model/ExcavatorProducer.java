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
        list.add(new Excavator("JCB",120,720));
        list.add(new Excavator("Volvo",150,1100));
        list.add(new Excavator("Hitachi",90,900));
        return list;
    }
}
