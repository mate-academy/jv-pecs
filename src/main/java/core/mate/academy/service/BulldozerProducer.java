package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer();

        bulldozer1.setName("Bulldozer 1");
        bulldozer1.setColor("Black");
        bulldozer1.setWeight(300);
        bulldozer1.setDumpDeepening(1);
        bulldozer1.setHeight(3);

        bulldozer2.setName("Bulldozer 2");
        bulldozer2.setColor("White");
        bulldozer2.setWeight(200);
        bulldozer2.setDumpDeepening(2);
        bulldozer2.setHeight(5);

        bulldozer3.setName("Bulldozer 3");
        bulldozer3.setColor("Red");
        bulldozer3.setWeight(400);
        bulldozer3.setDumpDeepening(3);
        bulldozer3.setHeight(4);

        List<Bulldozer> bulldozerList = new ArrayList<Bulldozer>();

        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        bulldozerList.add(bulldozer3);

        return  bulldozerList;
    }
}
