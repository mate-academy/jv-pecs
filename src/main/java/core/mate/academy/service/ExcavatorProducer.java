package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("SC3", "Red", "disel"));
        excavators.add(new Excavator("SC2", "Green", "disel"));
        excavators.add(new Excavator("SC6", "Yellow", "disel"));
        return excavators;
    }
}
