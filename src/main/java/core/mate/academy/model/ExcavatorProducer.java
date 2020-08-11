package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<Excavator>();
        excavatorList.add(new Excavator(2,5.6f,"BMW", "yellow"));
        excavatorList.add(new Excavator(5,6.7f,"Audi", "black"));
        excavatorList.add(new Excavator(7,10.8f,"Mers", "blue"));
        return excavatorList;
    }
}
