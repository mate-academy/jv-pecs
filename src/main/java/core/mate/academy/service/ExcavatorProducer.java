package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator nitachi = new Excavator();
        Excavator volvo = new Excavator();
        nitachi.setColor("Grey");
        volvo.setColor("Black");
        nitachi.setName("Hitachi");
        volvo.setName("Volvo");
        return new ArrayList<>(List.of(nitachi, volvo));
    }
}
