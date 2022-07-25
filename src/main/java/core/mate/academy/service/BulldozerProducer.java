package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Cat 9DT", "yellow"));
        list.add(new Bulldozer("John Deere 1050K", "yellow"));
        return list;
    }
}
