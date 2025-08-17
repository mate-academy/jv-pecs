package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("CAT 323DL", "Yellow", "Rubber tracks"));
        excavators.add(new Excavator("Komatsu PC210", "Green", "Wheels"));
        excavators.add(new Excavator("Liebherr R926", "Khaki", "tracks"));
        return excavators;
    }
}
