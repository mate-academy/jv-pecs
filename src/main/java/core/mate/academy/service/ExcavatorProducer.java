package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator>{
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("Volvo", "white", "mono boom");
        Excavator secondExcavator = new Excavator("Leibherr", "black", "mono boom");
        Excavator thirdExcavator = new Excavator("Hitachi", "red", "knuckle boom");
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
