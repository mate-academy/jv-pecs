package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        final Excavator excavator1 = new Excavator("Cat C7", 1.43F,
                "Universal","Yellow");
        final Excavator excavator2 = new Excavator("318D2L",13.7f,
                "Mine","Black");
        final Excavator excavator3 = new Excavator("M317D2",12.2f,
                "Career","Braun");
        return List.of(excavator1,excavator2,excavator3);
    }
}
