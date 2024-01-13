package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Volvo", "Yellow", "Compact"));
        list.add(new Excavator("Hitachi", "Black", "Midi"));
        list.add(new Excavator("JCB", "Magenta", "Standard"));
        return list;
    }
}
