package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> bulldozerArrayList = new ArrayList<>();
        bulldozerArrayList.add(new Bulldozer("bulldozer", "white", "kamaz", 2000, 80));
        bulldozerArrayList.add(new Bulldozer("bulldozer", "blue", "reno", 1999, 75));
        bulldozerArrayList.add(new Bulldozer("bulldozer", "black", "strength", 2012, 100));
        bulldozerArrayList.add(new Bulldozer("bulldozer", "red", "raven", 2015, 103));
        bulldozerArrayList.add(new Bulldozer("bulldozer", "yellow", "superin", 2017, 105));
        return bulldozerArrayList;
    }
}
