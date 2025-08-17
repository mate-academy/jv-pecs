package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    private Bulldozer bulldozer1 = new Bulldozer("Sem", "red", 2033);
    private Bulldozer bulldozer2 = new Bulldozer("Vol", "blue", 4455);
    private Bulldozer bulldozer3 = new Bulldozer("Dew", "orange", 990);
    private List<Bulldozer> machines = List.of(bulldozer1, bulldozer2, bulldozer3);

    @Override
    public List<? extends Bulldozer> get() {
        return new ArrayList<Bulldozer>(machines);
    }
}
