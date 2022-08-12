package core.mate.academy.producer.implementations;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            bulldozers.add(new Bulldozer("JCB", "yellow", "JCB-13 bucket"));
        }
        return bulldozers;
    }
}
