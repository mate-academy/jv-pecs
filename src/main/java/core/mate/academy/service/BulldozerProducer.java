package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setColor("Violet");
        bulldozer1.setName("Jack");
        bulldozer1.setBladeHeight(10);
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setColor("Brown");
        bulldozer2.setName("John");
        bulldozer2.setBladeHeight(16);
        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.setColor("Orange");
        bulldozer3.setName("Mickael");
        bulldozer3.setBladeHeight(22);

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
