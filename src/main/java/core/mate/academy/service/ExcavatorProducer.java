package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator jcbExcavator = new Excavator("JCB", 143,"diesel");
        Excavator fotonExcavator = new Excavator("Foton", 247, "diesel");
        Excavator volvoExcavator = new Excavator("Volvo",360,"diesel");
        return List.of(jcbExcavator, fotonExcavator, volvoExcavator);
    }
}
