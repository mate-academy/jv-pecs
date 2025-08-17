package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Caterpillar", "Yellow", 350);
        Bulldozer secondBulldozer = new Bulldozer("Liebherr", "Black", 450);
        Bulldozer thirdBulldozer = new Bulldozer("ХТЗ ТС-5", "Orange", 550);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
