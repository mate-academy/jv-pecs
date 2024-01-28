package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer.BulldozerBuilder()
                .setBladeCapacity(15)
                .setWeight(2.1)
                .setEnginePower(250)
                .build());
        bulldozers.add(new Bulldozer.BulldozerBuilder()
                .setBladeCapacity(18)
                .setWeight(2.3)
                .setEnginePower(283)
                .build());
        bulldozers.add(new Bulldozer.BulldozerBuilder()
                .setBladeCapacity(25)
                .setWeight(3.1)
                .setEnginePower(320)
                .build());
        return bulldozers;
    }
}
