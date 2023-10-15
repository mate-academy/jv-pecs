package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> machines = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName("Big");
        bulldozer.setColor("White");
        machines.add(bulldozer);
        bulldozer = new Bulldozer();
        bulldozer.setName("Small");
        bulldozer.setColor("Black");
        machines.add(bulldozer);
        return machines;
    }
}
