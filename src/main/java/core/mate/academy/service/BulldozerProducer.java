package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> objects = new ArrayList<>();
        objects.add(new Bulldozer());
        objects.add(new Bulldozer());
        objects.add(new Bulldozer());
        return objects;
    }
}
