package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Truck> {

    private final List<Truck> truckList = new ArrayList<>();

    @Override
    public List<? extends Machine> get() {
        createTruckList();
        return truckList;
    }

    private void createTruckList() {
        for (int i = 0; i < 3; i++) {
            Truck truck = new Truck();
            truck.setColor("Color" + i);
            truck.setName("name" + i);
            truckList.add(truck);
        }
    }
}
