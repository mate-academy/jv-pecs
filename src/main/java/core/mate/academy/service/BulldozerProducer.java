package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "yellow", "Maker1", "Model1", 2001));
        bulldozers.add(new Bulldozer("Bulldozer2", "red", "Maker2", "Model2", 2002));
        bulldozers.add(new Bulldozer("Bulldozer3", "green", "Maker3", "Model3", 2003));
        bulldozers.add(new Bulldozer("Bulldozer4", "white", "Maker4", "Model4", 2004));
        bulldozers.add(new Bulldozer("Bulldozer5", "black", "Maker5", "Model5", 2005));
        return bulldozers;
    }
}
