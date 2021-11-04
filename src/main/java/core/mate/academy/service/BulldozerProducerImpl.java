package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private static final Bulldozer FIRST_BULLDOZER = new Bulldozer("yellow", 2000, "Caterpillar");
    private static final Bulldozer SECOND_BULLDOZER = new Bulldozer("black", 3000, "Liebherr");
    private static final Bulldozer THIRD_BULLDOZER = new Bulldozer("white", 2500, "Komatsu");

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(FIRST_BULLDOZER);
        bulldozers.add(SECOND_BULLDOZER);
        bulldozers.add(THIRD_BULLDOZER);
        return bulldozers;
    }
}
