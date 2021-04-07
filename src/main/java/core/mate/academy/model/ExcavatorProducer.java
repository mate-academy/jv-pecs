package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Digger", "green", 2));
        excavatorList.add(new Excavator("Crawler", "grey", 3));
        excavatorList.add(new Excavator("Rover", "black", 4));
        return excavatorList;
    }
}
