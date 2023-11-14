package core.mate.academy.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavatorOne = new Excavator("T1000", 1000);
    private final Excavator excavatorTwo = new Excavator("T2000", 2000);
    private final Excavator excavatorThree = new Excavator("T3000", 3000);

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavatorOne);
        excavatorList.add(excavatorTwo);
        excavatorList.add(excavatorThree);
        return excavatorList;
    }
}

