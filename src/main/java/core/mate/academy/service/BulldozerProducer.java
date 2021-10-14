package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();

    {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName("Bulldozer");
        bulldozer.setColor("White");
        bulldozer.setWight(50);
        bulldozers.add(bulldozer);
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
