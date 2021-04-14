package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator cat = new Excavator("Cat", "Yellow", "245ME");
        Excavator volvo = new Excavator("Volvo", "Blue", "EC140E");
        Excavator tmc = new Excavator("TMC", "Black", "Hitachi");
        return List.of(cat, volvo, tmc);
    }
}
