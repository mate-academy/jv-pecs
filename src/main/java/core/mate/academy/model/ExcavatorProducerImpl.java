package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("Exc1", 10, 20);
    private Excavator excavator2 = new Excavator("Exc2", 30, 40);
    private Excavator excavator3 = new Excavator("Exc3", 50, 60);

    @Override
    public List<Excavator> get() {
        return List.of(excavator1, excavator2, excavator3);
    }
}
