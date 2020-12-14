package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar D10", "Yellow", "U"));
        bulldozers.add(new Bulldozer("Komatsu D85", "Green", "semi-U"));
        bulldozers.add(new Bulldozer("Zettelmeyer ZD3001", "Brown", "S"));
        return bulldozers;
    }
}
