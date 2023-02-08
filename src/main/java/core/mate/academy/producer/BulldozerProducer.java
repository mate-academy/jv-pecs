package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        bulldozerOne.setBladeType("S");
        bulldozerOne.setOperatingWeight(2500);
        bulldozerOne.setColor("Yellow");
        bulldozerOne.setName("CAT");
        Bulldozer bulldozerTwo = new Bulldozer();
        bulldozerTwo.setBladeType("U");
        bulldozerTwo.setOperatingWeight(3000);
        bulldozerTwo.setColor("Red");
        bulldozerTwo.setName("CAT");
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozerOne);
        bulldozerList.add(bulldozerTwo);
        return bulldozerList;
    }
}
