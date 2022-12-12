package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer();
        Bulldozer thirdBulldozer = new Bulldozer();
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(firstBulldozer);
        bulldozers.add(secondBulldozer);
        bulldozers.add(thirdBulldozer);
        return bulldozers;
    }
}
