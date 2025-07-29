package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        final List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer b1 = new Bulldozer();
        b1.setName("Cat 12");
        b1.setColor("yellow");
        b1.setBladeWidth(3.5);
        bulldozers.add(b1);

        Bulldozer b2 = new Bulldozer();
        b2.setName("Kamatsu D65");
        b2.setColor("orange");
        b2.setBladeWidth(4.2);
        bulldozers.add(b2);

        return bulldozers;
    }
}
