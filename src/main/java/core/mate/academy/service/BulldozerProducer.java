package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("CAT D6", "Black", 20000, 500));
        list.add(new Bulldozer("Komatsu D65", "Blue", 19500.0, 230));
        return list;
    }
}
