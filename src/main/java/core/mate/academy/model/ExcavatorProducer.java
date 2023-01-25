package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator doosanDx160w3 = new Excavator(385.25, "DX160W_3", "Orange");
        Excavator caterpillarM316f = new Excavator(400.35, "M316F", "Green");
        Excavator hitachiZx130w = new Excavator(670.35, "ZX130W", "Gray");
        return List.of(doosanDx160w3, caterpillarM316f, hitachiZx130w);
    }
}
