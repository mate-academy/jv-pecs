package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setLaddleWidth(2500);
        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setLaddleWidth(2000);
        bulldozers.add(firstBulldozer);
        bulldozers.add(secondBulldozer);
        return bulldozers;
    }
}
