package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bulldozers01", "green", "S-Blade"));
        bulldozers.add(new Bulldozer("bulldozers02", "yellow", "U-Blade"));
        bulldozers.add(new Bulldozer("bulldozers03", "red", "PAT"));
        return bulldozers;
    }
}
