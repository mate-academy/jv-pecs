package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer caterpillar = new Bulldozer("Caterpillar", "Green", 100, 200, "Gasoline");
        Bulldozer komatsu = new Bulldozer("Komatsu", "White", 100, 200, "Gasoline");
        Bulldozer volvo = new Bulldozer("Volvo", "Green", 150, 300, "Gasoline");
        return List.of(caterpillar, komatsu, volvo);
    }
}
