package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer(4.5, 5);
    private Bulldozer bulldozer2 = new Bulldozer(5.5, 6.5);

    private List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List get() {
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
