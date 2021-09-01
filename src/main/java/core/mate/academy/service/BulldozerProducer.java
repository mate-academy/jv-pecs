package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("First bulldozer", "white", 2001));
        bulldozerList.add(new Bulldozer("Second bulldozer", "blue", 2002));
        bulldozerList.add(new Bulldozer("Third bulldozer", "red", 2003));
        return bulldozerList;
    }
}
