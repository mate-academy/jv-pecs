package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Machine> get() {
        final Machine bulldozer1 = new Bulldozer("Ukraine",2023);
        final Machine bulldozer2 = new Bulldozer("USA",2014);
        final Machine bulldozer3 = new Bulldozer("Poland",2019);
        bulldozer1.setColor("Yellow");
        bulldozer1.setName("General purpose");
        bulldozer2.setColor("Blu");
        bulldozer2.setName("Specialized");
        bulldozer3.setColor("Red");
        bulldozer3.setName("Adapted");
        return List.of(bulldozer1,bulldozer2,bulldozer3);
    }
}
