package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("first","red",10, 25),
                new Bulldozer("second","green",12, 30),
                new Bulldozer("third","blue",15, 28));
    }
}
