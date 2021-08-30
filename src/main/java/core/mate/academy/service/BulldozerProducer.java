package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(6, 200, "Caterpillar", "Yellow");
        Bulldozer bulldozer2 = new Bulldozer(10, 300, "Komatsu", "Orange");
        Bulldozer bulldozer3 = new Bulldozer(8, 250, "Bobcat", "White");
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
