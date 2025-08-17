package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator liebherr = new Excavator("Liebherr-01", "Red", 100.1, true, 100);
        Excavator jcb = new Excavator("JCB-01", "Yellow", 110.5, true, 120);
        Excavator hyundai = new Excavator("Hyundai-01", "Green", 95.5, false, 80);
        return List.of(liebherr, jcb, hyundai);
    }
}
