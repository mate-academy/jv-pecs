package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators;

    {
        Excavator excavatorsFirst = new Excavator("ExcavatorFirst", "White", 30);
        Excavator excavatorsSecond = new Excavator("ExcavatorSecond", "Black", 35);
        Excavator excavatorsThird = new Excavator("ExcavatorThird", "Orange", 25);
        excavators = List.of(excavatorsFirst, excavatorsSecond, excavatorsThird);
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
