package core.mate.academy.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavatorOne = new Excavator("Red");
    private final Excavator excavatorTwo = new Excavator("Black");
    private final Excavator excavatorThree = new Excavator("White");

    @Override
    public List<Excavator> get() {
        return List.of(excavatorOne, excavatorTwo, excavatorThree);
    }
}
