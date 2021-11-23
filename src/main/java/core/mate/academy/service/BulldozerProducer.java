package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> produce() {

        Bulldozer bully = new Bulldozer();
        bully.setId(0);
        bully.setName("Bully");

        Bulldozer sally = new Bulldozer();
        sally.setId(1);
        sally.setName("Sally");

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bully);
        bulldozers.add(sally);
        return bulldozers;
    }

}
