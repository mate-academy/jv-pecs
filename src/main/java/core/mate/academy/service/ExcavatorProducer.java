package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator constructionExcavator = new Excavator();
        Excavator agriculturalExcavator = new Excavator();
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(constructionExcavator);
        excavators.add(agriculturalExcavator);
        return excavators;
    }
}
