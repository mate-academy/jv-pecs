package core.mate.academy.implementations;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorsList = new ArrayList<>();
        excavatorsList.add(new Excavator("excavator1", "yellow", "crawler", 1.4));
        excavatorsList.add(new Excavator("excavator2", "green","crawler", 1.5));
        excavatorsList.add(new Excavator("excavator3", "grey","wheeled", 1.6));
        return excavatorsList;
    }
}
