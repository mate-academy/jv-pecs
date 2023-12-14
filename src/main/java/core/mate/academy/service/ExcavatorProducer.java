package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Crawler", "Red",1.5));
        excavators.add(new Excavator("Wheeled", "Yelow", 3.4));
        excavators.add(new Excavator("Mini", "Red", 0.5));
        return excavators;
    }
}
