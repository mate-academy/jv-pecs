package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("High","Black",150);
        Excavator excavator2 = new Excavator("Higher","Yellow",200);
        Excavator excavator3 = new Excavator("Highest","Green",250);
        return List.of(excavator1,excavator2,excavator3);
    }
}
