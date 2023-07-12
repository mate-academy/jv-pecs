package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setName("Doosan");
        firstExcavator.setColor("Green");
        firstExcavator.setBucketVolume(2.5);
        Excavator secondExcavator = new Excavator();
        secondExcavator.setName("Hitachi");
        secondExcavator.setColor("Blue");
        secondExcavator.setBucketVolume(2.7);
        List<Machine> excavatorList = List.of(firstExcavator, secondExcavator);
        return excavatorList;
    }
}
