package core.mate.academy.service.impl;

import core.mate.academy.enums.BulldozerVariant;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

import static core.mate.academy.enums.BulldozerVariant.ARMORED;
import static core.mate.academy.enums.BulldozerVariant.REMOTE_CONTROLLED;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList();
        bulldozers.add(new Bulldozer(ARMORED));
        bulldozers.add(new Bulldozer(REMOTE_CONTROLLED));
        return bulldozers;
    }
}
