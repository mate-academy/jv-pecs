package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Hitachi", "Yellow", 3, 5));
        excavators.add(new Excavator("Terex MHL", "Red", 1, 2));
        excavators.add(new Excavator("Volvo", "Grin", 2, 4));
        excavators.add(new Excavator("Doosan DX", "Grey", 3, 4));
        return excavators;
    }
}

