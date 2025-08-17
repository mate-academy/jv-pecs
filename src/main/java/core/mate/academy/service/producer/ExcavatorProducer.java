package core.mate.academy.service.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator komatsuExcavator = new Excavator("PC138US-2", "yellow", 10.5, 226,
                0.5, 5900, 900);
        Excavator shantuiExcavator = new Excavator("SE135", "orange", 11.3, 260,
                0.55, 5490, 915);
        Excavator caterpillarExcavator = new Excavator("320 GC", "yellow", 11.6, 442,
                1.00, 6706, 457.2);
        return List.of(komatsuExcavator, shantuiExcavator, caterpillarExcavator);
    }
}
