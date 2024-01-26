package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> getModels() {
        ArrayList<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(40));
        bulldozers.add(new Bulldozer(60));
        bulldozers.add(new Bulldozer(100));
        return bulldozers;
    }
}
