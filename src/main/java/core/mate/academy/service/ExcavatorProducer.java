package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator excavatorFirst = new Excavator("Excavator 1", "black", 1);
        Excavator excavatorSecond = new Excavator("Excavator 2", "orange", 1);
        Excavator excavatorThird = new Excavator("Excavator 3", "white", 1);

        List<Excavator> excavatorList = List.of(excavatorFirst, excavatorSecond, excavatorThird);

        return excavatorList;
    }
}
