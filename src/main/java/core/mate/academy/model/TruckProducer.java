package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck001 = new Truck(1100.25, "truck758", "White");
        Truck truck002 = new Truck(1220.35, "truck400", "Green");
        Truck truck003 = new Truck(2010.20, "truck808", "Gray");
        return List.of(truck001, truck002, truck003);
    }
}
