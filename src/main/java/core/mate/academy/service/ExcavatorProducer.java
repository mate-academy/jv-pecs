package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator volvo = new Excavator("Volvo", "yellow", 100);
    private Excavator komatsu = new Excavator("Komatsu", "red", 150);
    private Excavator hitachi = new Excavator("Hitachi", "orange", 160);
    private Excavator defaultExcavator = new Excavator();

    @Override
    public List<Excavator> get() {
        return List.of(volvo, komatsu, hitachi, defaultExcavator);
    }
}
