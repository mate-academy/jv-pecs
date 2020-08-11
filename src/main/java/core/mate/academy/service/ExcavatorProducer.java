package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    @Override
    public List<Excavator> get() {
        Excavator excavatorSingle = new Excavator();
        excavatorSingle.setName("Single");
        Excavator excavatorDouble = new Excavator();
        excavatorDouble.setName("Double");

        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavatorSingle);
        excavatorList.add(excavatorDouble);
        return excavatorList;
    }
}
