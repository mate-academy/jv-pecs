package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        bulldozerOne.setBladeLength(9);
        bulldozerOne.setName("Fast");
        bulldozerOne.setColor("grey");
        Bulldozer bulldozerTwo = new Bulldozer();
        bulldozerTwo.setBladeLength(11);
        bulldozerTwo.setName("Slow");
        bulldozerTwo.setColor("orange");
        return List.of(bulldozerOne, bulldozerTwo);
    }
}
