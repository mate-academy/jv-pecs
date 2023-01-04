package core.mate.academy.impl;

import core.mate.academy.enums.Colors;
import core.mate.academy.enums.Models;
import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            excavatorList.add(new Excavator(Models.random(), Colors.random()));
        }
        return excavatorList;
    }
}
