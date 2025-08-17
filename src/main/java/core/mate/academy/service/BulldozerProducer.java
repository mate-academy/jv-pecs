package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("Bulldozer1");
        bulldozer1.setColor("Yellow");
        bulldozer1.setBladeLength(4);
        bulldozer1.setBladeWidth(3);
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Bulldozer2");
        bulldozer2.setColor("Pink");
        bulldozer2.setBladeLength(3);
        bulldozer2.setBladeWidth(5);
        return List.of(bulldozer1,bulldozer2);
    }
}
