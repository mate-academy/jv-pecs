package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();

    {
        bulldozers.add(new Bulldozer("JSB"));
        bulldozers.add(new Bulldozer("CAT"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }

}
