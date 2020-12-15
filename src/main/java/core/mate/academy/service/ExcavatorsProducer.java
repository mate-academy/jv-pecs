package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorsProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators;

    public ExcavatorsProducer() {
        excavators = new ArrayList<>();
        Excavator excavator1 = new Excavator("Excavator1", "white", "caterpillar",
                "singleBucket", "career");
        Excavator excavator2 = new Excavator("Excavator2", "green","walking",
                "continuousAction", "undergroundWork");
        Excavator excavator3 = new Excavator("Excavator3", "gray","pneumatic",
                "vacuum", "universal");
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
