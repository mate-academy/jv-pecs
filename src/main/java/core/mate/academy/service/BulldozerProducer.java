package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer first = new Bulldozer(2,100);
        Bulldozer second = new Bulldozer(2,120);
        Bulldozer third = new Bulldozer(1,160);
        List<Bulldozer> bulldozers = List.of(first, second, third);
        return bulldozers;
    }
}
