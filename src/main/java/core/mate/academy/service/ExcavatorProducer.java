package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator();
    private Excavator excavator2 = new Excavator();
    private Excavator excavator3 = new Excavator();
    private List<Excavator> excavators = List.of(excavator1, excavator2, excavator3);

    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavators = new ArrayList<Excavator>();
        for (Object element : excavators) {
            listOfExcavators.add((Excavator) element);
        }
        return listOfExcavators;
    }
}
