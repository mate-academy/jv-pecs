package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(15_000,"Mini Bulldozer");
        bulldozer1.setColor("Yellow");
        bulldozer1.setName("Bulldozer-1");
        bulldozers.add(bulldozer1);
        Bulldozer bulldozer2 = new Bulldozer(50_000,"Wheel Bulldozer");
        bulldozer2.setColor("White");
        bulldozer2.setName("Bulldozer-2");
        bulldozers.add(bulldozer2);
        Bulldozer bulldozer3 = new Bulldozer(25_000,"Crawler Bulldozer");
        bulldozer3.setColor("Red");
        bulldozer3.setName("Bulldozer-3");
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
