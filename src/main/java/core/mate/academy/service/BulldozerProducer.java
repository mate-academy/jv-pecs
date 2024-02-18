package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final List<Bulldozer> BULLDOZER_LIST = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        var firstBulldozer = new Bulldozer("First Bulldozer", "White", "ripper");
        var secondBulldozer = new Bulldozer("Second Bulldozer", "Black", "ripper");
        BULLDOZER_LIST.add(firstBulldozer);
        BULLDOZER_LIST.add(secondBulldozer);
        return BULLDOZER_LIST;
    }
}
