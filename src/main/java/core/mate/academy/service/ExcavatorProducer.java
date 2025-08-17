package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private Excavator ex1 = new Excavator("short swing", "bucket");
    private Excavator ex2 = new Excavator("long reach", "ripper");
    private List<Excavator> list = List.of(ex1, ex2);

    @Override
    public List<Excavator> get() {
        return list;
    }
}
