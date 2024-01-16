package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Blade", "Hydraulic", "GPS Guidance"));
        bulldozers.add(new Bulldozer("Ripper", "Manual", "None"));
        bulldozers.add(new Bulldozer("Bucket", "Automatic", "Extra strong chassis"));
        return bulldozers;
    }
}
