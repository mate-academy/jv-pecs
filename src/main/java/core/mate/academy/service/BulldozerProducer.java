package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setColor("yellow");
        bulldozer1.setName("bulldozer1");
        bulldozer1.setBladeLength(100);
        bulldozer1.setBladeWeight(250);
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setColor("black");
        bulldozer2.setName("bulldozer2");
        bulldozer2.setBladeLength(120);
        bulldozer2.setBladeWeight(255);
        return List.of(bulldozer1, bulldozer2);
    }
}
