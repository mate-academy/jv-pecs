package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> resultList = new ArrayList<>();
        resultList.add(new Bulldozer());
        resultList.add(new Bulldozer());
        return resultList;
    }
}
