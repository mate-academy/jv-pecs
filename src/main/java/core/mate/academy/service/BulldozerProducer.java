package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();

        list.add(new Bulldozer(3.5, "гусеницы", 200));
        list.add(new Bulldozer(4.0, "гусеницы", 250));
        return list;
    }

}
