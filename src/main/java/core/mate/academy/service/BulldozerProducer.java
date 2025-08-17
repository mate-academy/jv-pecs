package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer(10);
        bulldozer1.setName("Bulldozer#1");
        bulldozer1.setColor("white");
        bulldozerList.add(bulldozer1);
        Bulldozer bulldozer2 = new Bulldozer(15);
        bulldozer1.setName("Bulldozer#2");
        bulldozer1.setColor("green");
        bulldozerList.add(bulldozer2);
        Bulldozer bulldozer3 = new Bulldozer(20);
        bulldozer1.setName("Bulldozer#2");
        bulldozer1.setColor("yellow");
        bulldozerList.add(bulldozer3);
        return bulldozerList;
    }
}
