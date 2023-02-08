package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setBladeType("S");
        bulldozer1.setOperatingWeight(2500);
        bulldozer1.setColor("Yellow");
        bulldozer1.setName("CAT");
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setBladeType("U");
        bulldozer2.setOperatingWeight(3000);
        bulldozer2.setColor("Red");
        bulldozer2.setName("CAT");
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        return bulldozerList;
    }
}
