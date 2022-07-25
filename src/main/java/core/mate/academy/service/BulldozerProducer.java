package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Machine> get() {
        Bulldozer Bulldozer_One = new Bulldozer("Bulldozer_One", "white", "standard");
        Bulldozer Bulldozer_Two = new Bulldozer("Bulldozer_Two", "yellow", "strong");
        Bulldozer Bulldozer_Three = new Bulldozer("Bulldozer_Three", "green", "heavy");
        return List.of(Bulldozer_One, Bulldozer_Two, Bulldozer_Three);
    }
}
