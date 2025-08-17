package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("JCB","orange", 120));
        excavatorList.add(new Excavator("Volvo","silver",125));
        excavatorList.add(new Excavator("Case","red",130));
        return excavatorList;
    }
}
