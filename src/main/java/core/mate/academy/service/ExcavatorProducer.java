package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator("John Deere", "green");
        Excavator excavatorTwo = new Excavator("CAT", "yellow");
        Excavator excavatorTree = new Excavator("New Holland", "blue");
        List<Excavator> excavatorsList = new ArrayList<>();
        excavatorsList.add(excavatorOne);
        excavatorsList.add(excavatorTwo);
        excavatorsList.add(excavatorTree);
        return excavatorsList;
    }
}
