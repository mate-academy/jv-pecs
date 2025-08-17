package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("TG-29", "white", "Caterpillar", 2015));
        bulldozers.add(new Bulldozer("UI-42", "black", "Nissan", 2015));
        bulldozers.add(new Bulldozer("IK-32", "blue", "MAN", 2015));
        return bulldozers;
    }
}
