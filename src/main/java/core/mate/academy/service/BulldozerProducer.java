package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("Caterpillar");
        bulldozer1.setColor("Yellow");
        bulldozer1.setBladeWidth(3.5D);
        List<Machine> list = new ArrayList<>();
        list.add(bulldozer1);
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Caterpillar");
        bulldozer2.setColor("Yellow");
        bulldozer2.setBladeWidth(3.0D);
        list.add(bulldozer2);
        return list;
    }
}
