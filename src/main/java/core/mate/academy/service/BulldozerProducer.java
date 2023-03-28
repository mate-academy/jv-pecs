package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer heavyBulldozer = new Bulldozer(300, "Heavy");
        Bulldozer lightBulldozer = new Bulldozer(120, "Light");
        Bulldozer diggingBulldozer = new Bulldozer(200, "Digging");
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(heavyBulldozer);
        bulldozers.add(lightBulldozer);
        bulldozers.add(diggingBulldozer);
        return bulldozers;
    }
}
