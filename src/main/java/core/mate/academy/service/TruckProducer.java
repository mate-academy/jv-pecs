package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck1", "black", "Model1", 10, 350));
        trucks.add(new Truck("Truck2", "green", "Model2", 12, 450));
        trucks.add(new Truck("Truck3", "yellow", "Model3", 14, 550));
        trucks.add(new Truck("Truck4", "white", "Model4", 16, 650));
        trucks.add(new Truck("Truck5", "colorful", "Model5", 18, 750));
        return trucks;
    }
}
