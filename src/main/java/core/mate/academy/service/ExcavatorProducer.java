package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator.ExcavatorBuilder()
                .setBucketRemoval(4)
                .setModel("Zinter")
                .setWeight(25)
                .build());
        excavators.add(new Excavator.ExcavatorBuilder()
                .setBucketRemoval(6)
                .setModel("Cat")
                .setWeight(33)
                .build());
        return excavators;
    }
}
