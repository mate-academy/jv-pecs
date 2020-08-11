package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setType("fgj1213");
        bulldozer1.setYear(1888);
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setType("gh788");
        bulldozer2.setYear(1889);
        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.setType("kkk333");
        bulldozer3.setYear(1887);
        List<Bulldozer> newBulldozers = new ArrayList<>();
        newBulldozers.add(bulldozer1);
        newBulldozers.add(bulldozer2);
        newBulldozers.add(bulldozer3);
        return newBulldozers;
    }
}
