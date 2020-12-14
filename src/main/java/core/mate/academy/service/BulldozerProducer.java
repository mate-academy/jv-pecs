package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer 1", "Black", 300, 3, 1);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer 2", "White", 200, 5, 2);
        Bulldozer bulldozer3 = new Bulldozer("Bulldozer 3", "Red", 400, 4, 3);

        List<Machine> bulldozerList = List.of(bulldozer1, bulldozer2, bulldozer3);

        return bulldozerList;
    }
}
