package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer newBulldozer = new Bulldozer("CI-300", "IK");
        Bulldozer previousBulldozer = new Bulldozer("CI-200", "IP");
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(newBulldozer);
        bulldozers.add(previousBulldozer);
        return bulldozers;
    }
}
