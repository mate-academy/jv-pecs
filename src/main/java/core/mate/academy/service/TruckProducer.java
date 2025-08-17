package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck waterTruck = new Truck("speciality trailers", 4500, "disk brakes");
        Truck miningTruck = new Truck("extendable flatbed", 5800, "drum brakes");
        Truck cementTruck = new Truck("flatbed", 6300, "drum brakes");
        return List.of(waterTruck, miningTruck, cementTruck);
    }
}
