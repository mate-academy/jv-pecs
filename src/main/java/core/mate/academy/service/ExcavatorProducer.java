package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavatorOne = new Excavator("John Deere", "green");
    private Excavator excavatorTwo = new Excavator("CAT", "yellow");
    private Excavator excavatorTree = new Excavator("New Holland", "blue");
    private final List<Excavator> excavators = List.of(
            excavatorOne, excavatorTwo, excavatorTree);

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
