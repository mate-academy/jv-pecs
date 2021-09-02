package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<T extends Excavator> implements MachineProducer {
    private List<Excavator> produce() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < DEFAULT_NUMBER_OF_MACHINES; i++) {
            excavatorList.add(new Excavator());
        }
        return excavatorList;
    }

    @Override
    public List<Excavator> get() {
      return produce();
    }
}
