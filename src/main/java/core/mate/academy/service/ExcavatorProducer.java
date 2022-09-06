package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("HYUNDAI", 48_000));
        excavatorList.add(new Excavator("Caterpillar", 53_000));
        excavatorList.add(new Excavator("Hitachi", 26_000));
        return excavatorList;
    }
}
