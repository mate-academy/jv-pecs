package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list;

    @Override
    public List<Truck> get() {
        createList();
        return list;
    }

    private void createList() {
        list = new ArrayList<>();
        Truck truck1 = new Truck();
        truck1.setTruckBodyVolume(1000);
        truck1.setName("Super big");
        truck1.setColor("white");
        list.add(truck1);
    }
}
