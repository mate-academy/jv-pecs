package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setNumber(new Random().nextInt(100));
        bulldozer.setYear((int)Math.floor(Math.random() * (2022 - 1960 + 1) + 1960));
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer);
        bulldozers.add(bulldozer);
        bulldozers.add(bulldozer);
        return bulldozers;
    }
}
