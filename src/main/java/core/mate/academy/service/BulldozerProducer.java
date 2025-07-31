package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer hydraulic = new Bulldozer();
        Bulldozer mechanical = new Bulldozer();
        Bulldozer electromechanical = new Bulldozer();
        return List.of(hydraulic, mechanical, electromechanical);
    }
}
