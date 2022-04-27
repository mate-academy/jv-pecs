package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(5000,7000,3000,30);
        bulldozer1.setName("Bulldozer1");
        bulldozer1.setColor("White");
        Bulldozer bulldozer2 = new Bulldozer(4000,6000,2000,20);
        bulldozer2.setName("Bulldozer2");
        bulldozer2.setColor("Orange");
        return List.of(bulldozer1, bulldozer2);
    }
}
