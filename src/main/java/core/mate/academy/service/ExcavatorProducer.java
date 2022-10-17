package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorsList = new ArrayList<>();
        excavatorsList.add(new Excavator(100,"Excavator1","blue"));
        excavatorsList.add(new Excavator(150,"Excavator2","semi-brown"));
        excavatorsList.add(new Excavator(200,"Excavator3","pink"));
        return excavatorsList;
    }
}
