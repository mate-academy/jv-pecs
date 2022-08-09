package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Truck> truckList = new ArrayList<>();

    public TruckProducer() {
        truckList.add(new Truck("firstTrack", "yellow"));
        truckList.add(new Truck("secondTrack", "pink"));
        truckList.add(new Truck("thirdTrack", "white"));
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
