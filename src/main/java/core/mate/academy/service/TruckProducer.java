package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck01 = new Truck("MAN", "Black", 1001, 25.00);
    private Truck truck02 = new Truck("Topacc", "White", 1002, 30.00);
    private Truck truck03 = new Truck("Scale", "Silver", 1003, 25.00);

    @Override
    public List<Truck> get() {
        return List.of(truck01, truck02, truck03);
    }
}
