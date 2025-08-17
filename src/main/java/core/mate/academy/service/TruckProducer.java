package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck manTruck = new Truck("MAN", "Black", 1001, 25.00);
    private Truck topaccTruck = new Truck("Topacc", "White", 1002, 30.00);
    private Truck scaleTruck = new Truck("Scale", "Silver", 1003, 25.00);

    @Override
    public List<Truck> get() {
        return List.of(manTruck, topaccTruck, scaleTruck);
    }
}
