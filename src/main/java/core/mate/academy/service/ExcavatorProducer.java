package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("Excavator-1",
                "Blue", 10000,"Crawler excavator");
        Excavator secondExcavator = new Excavator("Excavator-2",
                "Yellow", 75000,"Long-reach excavator");
        Excavator thirdExcavator = new Excavator("Excavator-3",
                "White", 60000,"Wheeled excavator");
        return List.of(firstExcavator,secondExcavator,thirdExcavator);
    }
}
