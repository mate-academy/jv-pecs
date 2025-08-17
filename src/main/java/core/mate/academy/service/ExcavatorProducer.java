package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator caterpillar = new Excavator(15, "CAT C-15");
        Excavator volvo = new Excavator(12, "Volvo V-12");
        Excavator mercedes = new Excavator(18, "Mercedes M-18");
        return List.of(caterpillar, volvo, mercedes);
    }
}
