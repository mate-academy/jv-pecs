package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer caterpillar = new Bulldozer("CAT-01", "Yellow", 100, 200, "Diesel");
        Bulldozer komatsu = new Bulldozer("Komatsu-01", "Orange", 110, 250, "Diesel");
        Bulldozer volvo = new Bulldozer("Volvo-01", "Blue", 130, 280, "Diesel");
        return List.of(caterpillar, komatsu, volvo);
    }
}
