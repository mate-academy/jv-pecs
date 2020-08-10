package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(11);
        Excavator excavator2 = new Excavator(22);
        Excavator excavator3 = new Excavator(33);
        List<Excavator> excavators = List.of(excavator1,excavator2,excavator3);
        return excavators;
    }
}
