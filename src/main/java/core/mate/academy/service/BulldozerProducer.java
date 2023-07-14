package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozerMachine = new ArrayList<>();
        bulldozerMachine.add(new Bulldozer("Ripper1", 100, "V6"));
        bulldozerMachine.add(new Bulldozer("Ripper2", 150, "V8"));
        bulldozerMachine.add(new Bulldozer("Ripper3", 200, "V12"));
        return bulldozerMachine;
    }
}
