package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineProducerImpl implements MachineProducer {
    private final Bulldozer bulldozer1 = new Bulldozer();
    private final Bulldozer bulldozer2 = new Bulldozer();
    private final Bulldozer bulldozer3 = new Bulldozer();
    private final Truck truck1 = new Truck();
    private final Truck truck2 = new Truck();
    private final Excavator excavator = new Excavator();

    @Override
    public List<? extends Machine> get() {
        return List.of(bulldozer1, truck1, bulldozer2, truck2, bulldozer3, excavator);
    }
}
