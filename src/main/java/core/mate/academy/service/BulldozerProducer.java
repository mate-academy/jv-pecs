package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer(10, "bulldozer1", "white");
    private Bulldozer bulldozer2 = new Bulldozer(20, "bulldozer2", "black");
    private Bulldozer bulldozer3 = new Bulldozer(30, "bulldozer3", "green");

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
