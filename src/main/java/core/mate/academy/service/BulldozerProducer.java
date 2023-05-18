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
        bulldozer.setMaxHorsePower(300);
        bulldozer.setBulldozerSize("Small");

        Bulldozer bulldozerMedium = new Bulldozer();
        bulldozerMedium.setName("Bulldozer 2");
        bulldozerMedium.setColor("Yellow");
        bulldozerMedium.setMaxHorsePower(450);
        bulldozerMedium.setBulldozerSize("Medium");

        Bulldozer bulldozerLarge = new Bulldozer();
        bulldozerLarge.setName("Bulldozer 3");
        bulldozerLarge.setColor("Orange");
        bulldozerLarge.setMaxHorsePower(480);
        bulldozerLarge.setBulldozerSize("Large");

        bulldozerList.add(bulldozer);
        bulldozerList.add(bulldozerMedium);
        bulldozerList.add(bulldozerLarge);
        return bulldozerList;
    }
}
