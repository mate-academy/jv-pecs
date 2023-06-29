package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer("Bull1", "red", 10);
    private Bulldozer bulldozer2 = new Bulldozer("Bull2", "black", 15);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
