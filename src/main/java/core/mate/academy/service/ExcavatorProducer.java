package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator holland = new Excavator();
        Excavator hitachi = new Excavator();
        Excavator kubota = new Excavator();
        return List.of(holland, hitachi, kubota);
    }
}
