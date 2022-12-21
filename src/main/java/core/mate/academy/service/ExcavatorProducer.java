package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List get() {
        Excavator excavatorJCb = new Excavator();
        Excavator excavatorDoosan = new Excavator();
        Excavator excavatorHyundai = new Excavator();
        List<Excavator> excavatorList = List.of(excavatorJCb, excavatorDoosan, excavatorHyundai);
        return excavatorList;
    }
}
