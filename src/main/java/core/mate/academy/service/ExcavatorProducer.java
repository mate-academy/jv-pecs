package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> excavatorArrayList = new ArrayList<>();
        excavatorArrayList.add(new Excavator("Volvo", "yellow", "Special", 3));
        excavatorArrayList.add(new Excavator());
        excavatorArrayList.add(new Excavator("Mercedes", "black", "Special-long", 4));
        return excavatorArrayList;
    }
}
