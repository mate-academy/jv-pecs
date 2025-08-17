package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        Bulldozer small = new Bulldozer("smallBulldozer", "blue", 255);
        Bulldozer middle = new Bulldozer("middleBulldozer", "yellow", 510);
        Bulldozer big = new Bulldozer("bigBulldozer", "green", 765);
        ArrayList<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(small);
        bulldozers.add(middle);
        bulldozers.add(big);
        return bulldozers;
    }
}
