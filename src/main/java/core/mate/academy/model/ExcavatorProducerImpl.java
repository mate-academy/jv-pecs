package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("Excavator 1");
        excavator1.setColor("Red");
        excavator1.setTypeLadle("Ladle 1");
        Excavator excavator2 = new Excavator();
        excavator2.setName("Excavator 2");
        excavator2.setColor("Green");
        excavator2.setTypeLadle("Ladle 2");
        List<Excavator> excavatorList = List.of(excavator1,excavator2);
        return excavatorList;
    }
}
