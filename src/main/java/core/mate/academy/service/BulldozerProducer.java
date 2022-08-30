package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers= new ArrayList<>();
        bulldozers.add(new Bulldozer("Volvo", "Red", 1700, 1500, 1400));
        bulldozers.add(new Bulldozer("Toyota", "Blue", 1700, 1500, 1400));
        bulldozers.add(new Bulldozer("Renault", "Green", 1700, 1500, 1400));
        return bulldozers;
    }
}
