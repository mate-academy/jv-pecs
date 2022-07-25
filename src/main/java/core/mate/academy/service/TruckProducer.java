package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Machine> get() {
        Truck Truck_One = new Truck("Truck_One", "black", "SuperCargo");
        Truck Truck_Two = new Truck("Truck_Two", "blue", "Standard");
        Truck Truck_Three = new Truck("Truck_Three", "green", "Wagon");
        return List.of(Truck_One, Truck_Two, Truck_Three);
    }
}
