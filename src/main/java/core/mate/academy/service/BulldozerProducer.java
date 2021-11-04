package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final Bulldozer FIRST_BULLDOZER
            = new Bulldozer("first bulldozer", "yellow");
    private static final Bulldozer SECOND_BULLDOZER
            = new Bulldozer("second bulldozer", "black");
    private static final Bulldozer THIRD_BULLDOZER
            = new Bulldozer("third bulldozer", "white");

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(FIRST_BULLDOZER);
        bulldozers.add(SECOND_BULLDOZER);
        bulldozers.add(THIRD_BULLDOZER);
        return bulldozers;
    }
}
