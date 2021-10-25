package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer bulldozer1 = new Bulldozer("Cat 834K", "yellow", 3500);
    private Bulldozer bulldozer2 = new Bulldozer("SEM 816D", "red", 3200);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
