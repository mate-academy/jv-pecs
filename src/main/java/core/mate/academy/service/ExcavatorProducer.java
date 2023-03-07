package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> excavatorArrayList = new ArrayList<>();
        excavatorArrayList.add(new Excavator("excavator", "white", "kamaz", 2000, 10));
        excavatorArrayList.add(new Excavator("excavator", "blue", "reno", 2001, 20));
        excavatorArrayList.add(new Excavator("excavator", "green", "strength", 2012, 25));
        excavatorArrayList.add(new Excavator("excavator", "white", "raven", 2017, 45));
        excavatorArrayList.add(new Excavator("excavator", "white", "superin", 2019, 50));
        return excavatorArrayList;
    }
}
