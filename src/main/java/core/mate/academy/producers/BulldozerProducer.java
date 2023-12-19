package core.mate.academy.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozerOne = new Bulldozer("Iron");
    private final Bulldozer bulldozerTwo = new Bulldozer("Plastic");
    private final Bulldozer bulldozerThree = new Bulldozer("Golden");

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozerOne, bulldozerTwo, bulldozerThree);
    }
}
