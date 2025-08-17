package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck("Volvo", "Black", 18.0);
    private Truck truck2 = new Truck("Renault", "Yellow", 17.5);
    private Truck truck3 = new Truck("Mercedes-Benz", "Silver", 18.2);

    @Override
    public List<Truck> get() {
        return List.of(truck1, truck2, truck3);
    }
}
