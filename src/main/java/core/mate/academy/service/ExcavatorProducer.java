package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Hydro excavation", 502));
        list.add(new Excavator("Forestry work",423));
        list.add(new Excavator("Aircraft recycling",650));
        return list;
    }
}
