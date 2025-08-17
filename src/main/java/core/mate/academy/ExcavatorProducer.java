package core.mate.academy;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Excavator> list = new ArrayList<>();
    private Excavator firstExcavator = new Excavator();
    private Excavator secondExcavator = new Excavator();
    private Excavator thirdExcavator = new Excavator();

    {
        list.add(firstExcavator);
        list.add(secondExcavator);
        list.add(thirdExcavator);
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
