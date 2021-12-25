package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer caterpillar = new Bulldozer(6, 200, "Caterpillar", "Yellow");
        Bulldozer komatsu = new Bulldozer(10, 300, "Komatsu", "Orange");
        Bulldozer bobcat = new Bulldozer(8, 250, "Bobcat", "White");
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(caterpillar);
        bulldozers.add(komatsu);
        bulldozers.add(bobcat);
        return bulldozers;
    }
}
