package core.mate.academy.service;

import core.mate.academy.model.BladeType;
import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer(BladeType.S_TYPE));
        list.add(new Bulldozer(BladeType.U_TYPE));
        list.add(new Bulldozer(BladeType.S_U_TYPE));
        return list;
    }
}
