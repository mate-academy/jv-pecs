package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> newList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Truck newTruck = new Truck();
            newTruck.setLoadCapacity(100);
            newTruck.setNumberOfAxles(2);
            newTruck.setNumberOfWheels(6);
            newTruck.setColor("yellow");
            newTruck.setName("Super Truck");
            newList.add(newTruck);
        }
        return newList;
    }
}
