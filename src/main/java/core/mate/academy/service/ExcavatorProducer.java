package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    private Excavator dniproExcavator = new Excavator();
    private Excavator kharkivExcavator = new Excavator();
    private Excavator johnDeerExcavator = new Excavator();

    private List<Excavator> excavatorList = List.of(dniproExcavator,
             kharkivExcavator, johnDeerExcavator);

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
