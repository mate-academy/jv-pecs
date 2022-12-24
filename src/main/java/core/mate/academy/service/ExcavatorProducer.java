package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("MAN", "Blue", "medium"));
        excavatorList.add(new Excavator("Kawasaki", "Black", "normal"));
        excavatorList.add(new Excavator("Mercedes", "Blue", "big"));
        return excavatorList;
    }
}
