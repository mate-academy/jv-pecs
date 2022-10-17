package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Excavator> excavatorList;

    public ExcavatorProducer() {
        excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Ex-7tonn", "Black", 7));
        excavatorList.add(new Excavator("Ex-8tonn", "Yellow",8));
        excavatorList.add(new Excavator("Ex-9tonn", "Green",9));
    }

    @Override
    public List get() {
        return excavatorList;
    }
}
