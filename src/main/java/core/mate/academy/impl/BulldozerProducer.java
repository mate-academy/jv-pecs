package core.mate.academy.impl;

import core.mate.academy.enums.Colors;
import core.mate.academy.enums.Models;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bulldozerList.add(new Bulldozer(Models.random(), Colors.random()));
        }
        return bulldozerList;
    }
}
