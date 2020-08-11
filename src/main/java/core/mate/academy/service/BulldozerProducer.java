package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0, n = 3; i < n; i++) {
            bulldozers.add(new Bulldozer("Buldozer" + i, "Red",
                    (int) (Math.random() * 10) + 1, Math.random() * 10 + 1, true));
        }
        return bulldozers;
    }
}
