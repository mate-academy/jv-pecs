package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator(10, "excavator1", "white");
    private Excavator excavator2 = new Excavator(20, "excavator2", "black");
    private Excavator excavator3 = new Excavator(30, "excavator3", "green");

    @Override
    public List<Excavator> get() {
        return List.of(excavator1, excavator2, excavator3);
    }
}
