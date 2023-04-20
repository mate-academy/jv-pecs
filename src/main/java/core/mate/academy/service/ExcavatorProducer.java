package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator liebherr = new Excavator("Liebherr", "White", 100.1, true, 100);
        Excavator jcb = new Excavator("JCB", "Black", 100.1, true, 100);
        Excavator hyundai = new Excavator("Hyundai", "Purple", 100.1, true, 100);
        return List.of(liebherr, jcb, hyundai);
    }
}
