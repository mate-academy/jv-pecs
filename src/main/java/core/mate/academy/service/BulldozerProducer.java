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
                new Bulldozer("Megaton", "Yellow", 400, "Metal", "Hydraulic"),
                new Bulldozer("Stilion", "Green", 350, "Rubber", "Mechanical"),
                new Bulldozer("Tinte", "Gray", 450, "Metal", "Electronic"));
        return bulldozers;
    }
}
