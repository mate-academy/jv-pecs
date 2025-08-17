package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truck = new ArrayList<>();
        truck.add(new Truck("ford", "blue", 2025, 14, 521));
        truck.add(new Truck("volvo", "black", 2024, 15, 512));
        truck.add(new Truck("iveco", "white", 2023, 16, 512));
        return truck;
    }
}
