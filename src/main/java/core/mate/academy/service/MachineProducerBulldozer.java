package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerBulldozer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer("Sun", "green", 2008, "USA");
        Bulldozer bulldozer2 = new Bulldozer("Cloud", "blue", 2000, "Ukraine");

        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);

        return bulldozerList;
    }
}
