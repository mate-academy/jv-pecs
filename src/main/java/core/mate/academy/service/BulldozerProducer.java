package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Collections.addAll(bulldozers,
                new Bulldozer("Bulldozer1", "yellow", "crawler", 3.00, 3.20),
                new Bulldozer("Bulldozer2", "white", "crawler", 3.50, 3.70),
                new Bulldozer("Bulldozer3", "red", "crawler", 4.00, 4.20)
        );
        return bulldozers;
    }
}
