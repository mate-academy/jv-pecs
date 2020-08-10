package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("ex777", "green");
        Excavator excavator2 = new Excavator("ex123", "red");
        Excavator excavator3 = new Excavator("ex987", "white");

        excavator1.setMaxWeight(5000);
        excavator2.setMaxWeight(7000);
        excavator3.setMaxWeight(2000);

        return List.of(excavator1, excavator2, excavator3);
    }
}
