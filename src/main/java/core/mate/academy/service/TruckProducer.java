package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer <Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> resultTruck = new ArrayList<>();
        resultTruck.add(new Truck("truck1", "t1", "11"));
        resultTruck.add(new Truck("truck", "t2", "22"));
        resultTruck.add(new Truck("truck", "t3", "33"));
        return resultTruck;
    };
}
