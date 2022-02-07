package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("New Holland", "yellow", 20.2, 3000);
        Excavator excavator2 = new Excavator("DEMAG Bagger", "green", 30.55, 4500);
        Excavator excavator3 = new Excavator("Capitol 760", "black", 10.1, 2800);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
