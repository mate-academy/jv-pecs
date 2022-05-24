package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("FGF-20", "red", "USA", 5400));
        excavators.add(new Excavator("BFG-3000", "black", "Ukraine", 4308));
        excavators.add(new Excavator("TRF-20", "pink", "Belarus", 4534));
        return excavators;
    }
}
