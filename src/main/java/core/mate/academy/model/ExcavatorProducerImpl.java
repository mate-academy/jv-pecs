package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("E1");
        excavator1.setColor("ER1");
        Excavator excavator2 = new Excavator();
        excavator2.setName("E2");
        excavator2.setColor("EG2");
        List<Excavator> excavatorList = List.of(excavator1,excavator2);
        return excavatorList;
    }
}
