package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {

        Excavator excavatorFirst = new Excavator("Mole","Ford", "GT500", 65000);
        Excavator excavatorSecond = new Excavator("Woodie","Lincoln", "LX700", 35000);
        Excavator excavatorThird = new Excavator("Hulk","MAN", "KDS350", 24000);

        List<Excavator> excavators = List.of(excavatorFirst, excavatorSecond, excavatorThird);

        return excavators;
    }
}
