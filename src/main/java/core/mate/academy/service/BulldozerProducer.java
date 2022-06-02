package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> output = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            output.add(new Bulldozer((i + 1) * 10));
        }
        return output;
    }
}
