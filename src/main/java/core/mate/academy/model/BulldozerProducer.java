package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(5, 10);
        Bulldozer bulldozer2 = new Bulldozer(15, 30);
        Bulldozer bulldozer3 = new Bulldozer(20, 40);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
