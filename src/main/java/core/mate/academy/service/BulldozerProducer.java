package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Caterpillar D11N", "S blade", false);
        Bulldozer secondBulldozer = new Bulldozer("Zettelmeyer ZD 3001", "S blade", false);
        Bulldozer thirdBulldozer = new Bulldozer("Volvo", "S blade", true);
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
