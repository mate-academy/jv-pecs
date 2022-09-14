package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        bulldozerOne.setName("BulldozerOne");
        bulldozerOne.setColor("Black");
        Bulldozer bulldozerTwo = new Bulldozer();
        bulldozerTwo.setName("BulldozerTwo");
        bulldozerTwo.setColor("Red");
        Bulldozer bulldozerThree = new Bulldozer();
        bulldozerThree.setName("BulldozerThree");
        bulldozerThree.setColor("Green");
        return List.of(bulldozerOne, bulldozerTwo, bulldozerThree);
    }
}
