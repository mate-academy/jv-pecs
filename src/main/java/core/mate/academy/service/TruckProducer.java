package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        firstTruck.setTruckType("Box truck");
        firstTruck.setPayloadCapacity(200);
        Truck secondTruck = new Truck();
        secondTruck.setTruckType("Flatbed");
        secondTruck.setPayloadCapacity(300);
        Truck thirdTruck = new Truck();
        thirdTruck.setTruckType("Tanker");
        thirdTruck.setPayloadCapacity(400);
        return List.of(firstTruck,secondTruck,thirdTruck);
    }
}
