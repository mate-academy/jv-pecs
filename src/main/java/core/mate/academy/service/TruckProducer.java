package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Mercedes Benz", "white", 500, "Vasyl"));
        trucks.add(new Truck("Renault", "green", 350, "Sergiy"));
        trucks.add(new Truck("Mitsubishi", "red", 400, "Volodymyr"));
        return trucks;
    }
}
