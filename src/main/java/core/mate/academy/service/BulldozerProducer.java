package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozersFirst = new Bulldozer("Blue","Bulldozer First");
        Bulldozer bulldozersSecond = new Bulldozer("Red","Bulldozer Second");
        return List.of(bulldozersFirst, bulldozersSecond);
    }
}
