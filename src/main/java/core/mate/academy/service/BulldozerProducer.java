package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    List<Machine> list = List.of(new Bulldozer(01, "Volvo"),
            new Bulldozer(02, "CAT"),
            new Bulldozer(03, "Komatsu"));

    @Override
    public List<Machine> get() {
        return list;
    }
}
