package core.mate.academy.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavatorOne = new Excavator("Red");
    private final Excavator excavatorTwo = new Excavator("Black");
    private final Excavator excavatorThree = new Excavator("White");

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavatorOne);
        excavators.add(excavatorTwo);
        excavators.add(excavatorThree);
        return excavators;
    }
}
