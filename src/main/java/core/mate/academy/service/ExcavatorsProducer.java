package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorsProducer <T extends Machine> implements MachineProducer <T>{
    private List <? super Machine> excavators;

    public ExcavatorsProducer() {
        Excavator excavator1 = new Excavator("caterpillar", "singleBucket", "career");
        Excavator excavator2 = new Excavator("walking", "continuousAction", "undergroundWork");
        Excavator excavator3 = new Excavator("pneumatic", "vacuum", "universal");
        excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
    }
    @Override
    public List<? super Machine> get() {
        return excavators;
    }
}
