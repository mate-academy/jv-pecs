package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozer = new Bulldozer();
    private final Bulldozer bulldozer1 = new Bulldozer();
    private final Bulldozer bulldozer2 = new Bulldozer();

    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = Arrays.asList(bulldozer, bulldozer1, bulldozer2);
        return bulldozers;
    }
}
