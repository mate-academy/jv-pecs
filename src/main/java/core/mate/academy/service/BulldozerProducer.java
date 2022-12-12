package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerGarry = new Bulldozer("Garry", "dirt", 330, "Wheels");
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        return List.of(bulldozerGarry, bulldozer1, bulldozer2);
    }
}
