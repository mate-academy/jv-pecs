package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozzerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Bull1", "yellow", 25000));
        list.add(new Bulldozer("Bull2", "red", 30000));
        list.add(new Bulldozer("Bull3", "white", 35000));
        return list;
    }
}
