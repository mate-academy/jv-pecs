package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("excavator1", "red");
        Excavator excavator2 = new Excavator("excavator2", "green");
        Excavator excavator3 = new Excavator("excavator3", "blue");

        excavator1.setWeight(5000);
        excavator2.setWeight(7000);
        excavator3.setWeight(2000);

        return List.of(excavator1, excavator2, excavator3);
    }
}
