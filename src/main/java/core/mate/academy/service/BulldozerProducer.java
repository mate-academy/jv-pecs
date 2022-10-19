package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setCuttingDepth(300);
        bulldozer1.setBladeManagement("rope");
        bulldozer1.setColor("yellow");
        bulldozer1.setName("first bulldozer");
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setCuttingDepth(200);
        bulldozer2.setBladeManagement("hydraulic");
        bulldozer2.setColor("blue");
        bulldozer2.setName("second bulldozer");
        return List.of(bulldozer1, bulldozer2);
    }
}
