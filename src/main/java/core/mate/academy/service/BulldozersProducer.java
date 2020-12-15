package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozersProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozerList;

    public BulldozersProducer() {
        bulldozerList = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer("First", "yellow", 300, 1000, 80);
        Bulldozer bulldozer2 = new Bulldozer("Second", "red", 200, 800, 75);
        Bulldozer bulldozer3 = new Bulldozer("Third", "orange",250, 900, 85);
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        bulldozerList.add(bulldozer3);
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
