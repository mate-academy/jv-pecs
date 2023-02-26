package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozer1 = new Bulldozer("Bulldozer1", "Yellow", 200);
    private final Bulldozer bulldozer2 = new Bulldozer("Bulldozer2", "Green", 250);
    private final Bulldozer bulldozer3 = new Bulldozer("Bulldozer3", "Grey", 300);
    private final List<Bulldozer> bulldozers = List.of(bulldozer1, bulldozer2, bulldozer3);
    
    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
