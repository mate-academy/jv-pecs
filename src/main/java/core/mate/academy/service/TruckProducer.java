package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck freightliner = new Truck(50, 150, "Freightliner", "White");
        Truck mercedesBenz = new Truck(45, 170, "Mercedes-Benz", "Silver");
        Truck volvo = new Truck(20, 190, "Volvo", "Red");
        List<Truck> trucks = new ArrayList<>();
        trucks.add(freightliner);
        trucks.add(mercedesBenz);
        trucks.add(volvo);
        return trucks;
    }
}
