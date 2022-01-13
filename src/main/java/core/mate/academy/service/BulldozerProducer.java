package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("D475A-5", "red", 5000, 108390));
        list.add(new Bulldozer("D475A-6", "yellow", 4545, 108390));
        list.add(new Bulldozer("D475A-7", "green", 3535, 108390));
        return list;
    }
}
