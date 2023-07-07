package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer("mechanical", 80, 3000);
    private Bulldozer bulldozer2 = new Bulldozer("mechanical", 120, 5000);
    private Bulldozer bulldozer3 = new Bulldozer("hydromechanical", 100, 6000);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = Arrays.asList(bulldozer1, bulldozer2, bulldozer3);
        return bulldozers;
    }
}
