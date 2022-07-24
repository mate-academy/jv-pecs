package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list;

    {
        list = new ArrayList<>();
        list.add(new Bulldozer("Cat 9DT", "yellow"));
        list.add(new Bulldozer("John Deere 1050K", "yellow"));
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
