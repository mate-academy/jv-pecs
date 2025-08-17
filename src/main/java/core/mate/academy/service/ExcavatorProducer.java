package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator newExcavator1 = new Excavator(50,"CAT");
        Excavator newExcavator2 = new Excavator(100,"DOG");
        Excavator newExcavator3 = new Excavator(150,"TIGER");
        return List.of(newExcavator1, newExcavator2, newExcavator3);
    }
}
