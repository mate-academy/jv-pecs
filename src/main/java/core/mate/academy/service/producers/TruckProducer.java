package core.mate.academy.service.producers;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        trucks.add(new Truck("Scania", "White", 8000));
        trucks.add(new Truck("Toyota", "Grey", 9500));
        trucks.add(new Truck("Volvo ", "Blue", 7500));
        return trucks;
    }
}
