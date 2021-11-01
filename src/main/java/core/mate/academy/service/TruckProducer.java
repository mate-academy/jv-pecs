package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Machine> get() {
        Truck cabo = new Truck("Cabo", "White", 5, 10);
        Truck man = new Truck("Man", "Blue", 8, 20);
        Truck scania = new Truck("Scania", "Red", 7, 15);
        return List.of(cabo, man, scania);
    }
}
