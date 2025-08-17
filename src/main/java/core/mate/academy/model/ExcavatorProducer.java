package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator jcb = new Excavator("Name : jcb 3CX sitemaster",
                "Color : Yellow",
                6.531,
                "Wheels");
        Excavator komatsu = new Excavator("Name : komatsu 160",
                "Color : Yellow",
                2590,
                "Tracks");
        return List.of(jcb, komatsu);
    }
}
