package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0, n = 3; i < n; i++) {
            excavators.add(new Excavator("Excavator" + i, "Pink",
                    (int) (Math.random() * 10) + 1, Math.random() * 10 + 1, true));
        }
        return excavators;
    }
}
