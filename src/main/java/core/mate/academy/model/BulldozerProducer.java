package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer((int) (Math.random() * 1000), "red", "Betsy"));
        bulldozersList.add(new Bulldozer((int) (Math.random() * 1000), "green", "Day"));
        bulldozersList.add(new Bulldozer((int) (Math.random() * 1000), "yellow", "Dandelion"));
        return bulldozersList;
    }
}
