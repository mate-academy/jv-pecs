package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Truck> list;

    {
        list = new ArrayList<>();
        Truck truck1 = new Truck();
        truck1.setTruckBodyVolume(1000);
        truck1.setName("Super big");
        truck1.setColor("white");
        list.add(truck1);
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
