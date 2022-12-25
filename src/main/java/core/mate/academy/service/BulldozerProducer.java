package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer komatsu = new Bulldozer("Komatsu D65 EX16", 4.25);
    private final Bulldozer liebherr = new Bulldozer("Liebherr PR 734", 4.10);
    private final Bulldozer shantuy = new Bulldozer("Shantui SD16", 4.30);
    private List<Bulldozer> bulldozers = List.of(komatsu, liebherr, shantuy);

    @Override
    public List<? extends Machine> get() {
        return bulldozers;
    }
}
