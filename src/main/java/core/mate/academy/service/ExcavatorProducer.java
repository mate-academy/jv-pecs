package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("EW-1400А", "orange",
                0.75, 900, 4650));
        excavatorList.add(new Excavator("ЭО-3223А", "yellow",
                0.75, 900, 4770));
        excavatorList.add(new Excavator("АМКОДОР 702ЕВ", "red",
                0.18, 610, 4100));
        return excavatorList;
    }
}
