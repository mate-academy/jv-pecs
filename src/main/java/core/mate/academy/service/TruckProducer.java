package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        firstTruck.setName("Daf");
        firstTruck.setColor("White");
        secondTruck.setName("Man");
        secondTruck.setColor("Green");
        return new ArrayList<>(List.of(firstTruck, secondTruck));
    }
}
