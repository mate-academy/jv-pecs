package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator001 = new Excavator(385.25, "Excavator303", "Orange");
        Excavator excavator002 = new Excavator(400.35, "Excavator500", "Green");
        Excavator excavator003 = new Excavator(670.35, "Excavator700", "Gray");
        return List.of(excavator001, excavator002, excavator003);
    }
}
