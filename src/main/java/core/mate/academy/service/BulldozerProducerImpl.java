package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        bulldozerOne.setBladeSize(10);
        bulldozerOne.setColor("blue");
        bulldozerOne.setName("JohnDeer");
        Bulldozer bulldozerTwo = new Bulldozer();
        bulldozerTwo.setBladeSize(20);
        bulldozerTwo.setColor("blue");
        bulldozerTwo.setName("CAT");
        return List.of(bulldozerOne,bulldozerTwo);
    }
}
