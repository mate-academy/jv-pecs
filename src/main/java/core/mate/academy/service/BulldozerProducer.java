package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    {
        bulldozers.add(new Bulldozer("John Deere", "green"));
        bulldozers.add(new Bulldozer("CAT", "yellow"));
        bulldozers.add(new Bulldozer("New Holland", "blue"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}



