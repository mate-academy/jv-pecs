package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();

        firstTruck.setName("first");
        secondTruck.setName("second");
        thirdTruck.setName("third");

        firstTruck.setColor("red");
        secondTruck.setColor("blue");
        thirdTruck.setColor("green");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
