package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("buddy", "yellow", 5.4, 54);
        Bulldozer bulldozer2 = new Bulldozer("bulldozer", "red", 6.5, 45);
        return List.of(bulldozer1, bulldozer2);
    }
}
