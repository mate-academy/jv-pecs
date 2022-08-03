package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setColor("Orange");
        bulldozer.setName("huge");
        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setColor("Gold");
        secondBulldozer.setName("immense");
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer);
        bulldozers.add(secondBulldozer);
        return bulldozers;
    }
}
