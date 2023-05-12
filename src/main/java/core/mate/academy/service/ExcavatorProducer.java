package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator nitachi = new Excavator("Hitachi", "Grey");
        Excavator volvo = new Excavator("Volvo", "Black");
        return List.of(nitachi, volvo);
    }
}
