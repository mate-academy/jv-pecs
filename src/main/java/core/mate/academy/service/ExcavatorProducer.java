package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavator = new ArrayList<>();
        listOfExcavator.add(new Excavator("Crawler", "JCB"));
        listOfExcavator.add(new Excavator("Dragline", "CAT"));
        listOfExcavator.add(new Excavator("Suction", "Komatsu"));
        return listOfExcavator;
    }
}
