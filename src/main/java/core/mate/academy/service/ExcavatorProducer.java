package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Volvo", "green", 500, "Kan"));
        excavators.add(new Excavator("Doosan", "blue", 400, "NovoBud"));
        excavators.add(new Excavator("Hitachi", "yellow", 450, "BD"));
        return excavators;
    }
}
