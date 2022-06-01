package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Maker1", "Model1", 2001));
        bulldozers.add(new Bulldozer("Maker2", "Model2", 2002));
        bulldozers.add(new Bulldozer("Maker3", "Model3", 2003));
        bulldozers.add(new Bulldozer("Maker4", "Model4", 2004));
        bulldozers.add(new Bulldozer("Maker5", "Model5", 2005));
        return bulldozers;
    }
}
