package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorArrayList = new ArrayList<>();
        int volvoNumberOfPumps = 3;
        int mercedesNumberOfPumps = 4;
        excavatorArrayList.add(new Excavator("Volvo", "yellow", "Special", volvoNumberOfPumps));
        excavatorArrayList.add(new Excavator());
        excavatorArrayList.add(new Excavator("Mercedes", "black", "Special-long",
                mercedesNumberOfPumps));
        return excavatorArrayList;
    }
}
