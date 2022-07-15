package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("CAT 336", 6.5, "yellow"));
        list.add(new Excavator("CAT 374", 3.8, "black"));
        list.add(new Excavator("CAT 326 SLR", 0.5, "green"));
        return list;
    }
}
