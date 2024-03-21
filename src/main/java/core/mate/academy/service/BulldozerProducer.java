package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("caterpillars", "hydraulic", 18984.0));
        bulldozers.add(new Bulldozer("caterpillars", "electromechanical", 21_613.0));
        bulldozers.add(new Bulldozer("wheels", "hydraulic", 14620.0));
        return bulldozers;
    }
}
