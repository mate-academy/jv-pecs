package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        final List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName("Bulldozer 1");
        bulldozer.setColor("Pink");
        bulldozer.setMaxPowerHp(300);
        bulldozer.setSizeBsl("Small");

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Bulldozer 2");
        bulldozer2.setColor("Yellow");
        bulldozer2.setMaxPowerHp(450);
        bulldozer2.setSizeBsl("Medium");

        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.setName("Bulldozer 3");
        bulldozer3.setColor("Orange");
        bulldozer3.setMaxPowerHp(480);
        bulldozer3.setSizeBsl("Large");

        bulldozerList.add(bulldozer);
        bulldozerList.add(bulldozer2);
        bulldozerList.add(bulldozer3);
        return bulldozerList;
    }
}
