package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator cai = new Excavator();
        Excavator toyota = new Excavator();
        cai.setModel("CAI");
        toyota.setModel("TOYOTA");
        List<Excavator> excavatorList = List.of(cai, toyota);
        return excavatorList;
    }
}
