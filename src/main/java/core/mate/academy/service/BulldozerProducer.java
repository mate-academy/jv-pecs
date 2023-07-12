package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        final Bulldozer bulldozer1 = new Bulldozer("Ukraine", 2023, "General purpose",
                "Yellow");
        final Bulldozer bulldozer2 = new Bulldozer("USA", 2014, "Specialized",
                "Blu");
        final Bulldozer bulldozer3 = new Bulldozer("Poland", 2019, "Adapted", "Red");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
