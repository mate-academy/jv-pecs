package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator exc1 = new Excavator("MN2000","grey",10,50);
        Excavator exc2 = new Excavator("MN2100","green",4,37);
        Excavator exc3 = new Excavator("MR20","yellow",5,70);
        return List.of(exc1,exc2,exc3);
    }
}
