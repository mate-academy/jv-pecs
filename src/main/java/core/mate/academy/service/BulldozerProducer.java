package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        bulldozerOne.setColor("blue");
        bulldozerOne.setName("smallBulldozer");
        bulldozerOne.setMaxPower(255);
        Bulldozer bulldozerTwo = new Bulldozer();
        bulldozerTwo.setColor("yellow");
        bulldozerTwo.setName("middleBulldozer");
        bulldozerTwo.setMaxPower(510);
        Bulldozer bulldozerThree = new Bulldozer();
        bulldozerThree.setColor("green");
        bulldozerThree.setName("bigBulldozer");
        bulldozerThree.setMaxPower(765);
        ArrayList<Bulldozer> output = new ArrayList<>();
        output.add(bulldozerOne);
        output.add(bulldozerTwo);
        output.add(bulldozerThree);
        return output;
    }
}
