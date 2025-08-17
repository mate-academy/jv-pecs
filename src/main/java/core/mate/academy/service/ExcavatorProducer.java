package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("CAT", "Yellow", "Crawler");
        Excavator secondExcavator = new Excavator("CAT", "Black", "Wheeled");
        Excavator thirdExcavator = new Excavator("CAT", "Red", "Suction");
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
