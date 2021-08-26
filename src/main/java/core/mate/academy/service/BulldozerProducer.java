package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer{

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        bulldozerOne.setColor("blue");
        bulldozerOne.setName("smallBulldozer");
        bulldozerOne.setMaxPower(255);
        Bulldozer bulldozerTwo = new Bulldozer();
        bulldozerOne.setColor("yellow");
        bulldozerOne.setName("middleBulldozer");
        bulldozerOne.setMaxPower(510);
        Bulldozer bulldozerThree = new Bulldozer();
        bulldozerOne.setColor("green");
        bulldozerOne.setName("bigBulldozer");
        bulldozerOne.setMaxPower(765);
        ArrayList<Bulldozer> output = new ArrayList<>();
        output.add(bulldozerOne);
        output.add(bulldozerTwo);
        output.add(bulldozerThree);
        return output;
    }
}
