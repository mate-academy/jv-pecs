package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    @Override
    public List<Machine> get() {
        Machine excavatorSingle = new Excavator();
        excavatorSingle.setName("Single");
        Machine excavatorDouble = new Excavator();
        excavatorDouble.setName("Double");

        List<Machine> excavatorList = new ArrayList<>();
        excavatorList.add(excavatorSingle);
        excavatorList.add(excavatorDouble);
        return excavatorList;
    }
}
