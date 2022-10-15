package core.mate.academy.producers;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List get() {
        Bulldozer bulldozer1 = new Bulldozer("gt140", "red", "pink", 240);
        Bulldozer bulldozer2 = new Bulldozer("gt340", "purple", "yellow", 279);
        Bulldozer bulldozer3 = new Bulldozer("mn213", "blue", "green", 999);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
