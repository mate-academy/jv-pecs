package core.mate.academy.service.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator miniExcavatorCat = new Excavator("300.9D", "Yellow",
                7, 0.31, 2.1);
        Excavator smallExcavatorCat = new Excavator("313 GC", "Yellow",
                11.4, 0.53, 3.7);
        Excavator mediumExcavatorCat = new Excavator("320 GC", "Yellow",
                22, 1, 5.8);
        return List.of(miniExcavatorCat, mediumExcavatorCat, smallExcavatorCat);
    }
}
