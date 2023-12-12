package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Cat", "yellow", 7553465));
        bulldozerList.add(new Bulldozer("Cat", "brown", 5435356));
        bulldozerList.add(new Bulldozer("Cat", "red", 1324454));
        return bulldozerList;
    }
}
