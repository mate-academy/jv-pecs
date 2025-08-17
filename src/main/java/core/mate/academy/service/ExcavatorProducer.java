package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator jcb = Excavator.create("JCB", "yellow",
                "medium", 4.25, true);
        Excavator cat = Excavator.create("CAT", "black",
                "large", 12.4, false);
        Excavator volvo = Excavator.create("Volvo", "white",
                "mini", 2.15, false);
        return List.of(jcb, cat, volvo);
    }
}
