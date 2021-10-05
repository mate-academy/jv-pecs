package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();
    private Bulldozer bulldozer1 = new Bulldozer();
    private Bulldozer bulldozer2 = new Bulldozer();
    private Bulldozer bulldozer3 = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
