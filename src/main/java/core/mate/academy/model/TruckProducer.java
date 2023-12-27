package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck().setMaxPermissibleWeight(1000).setMaxPermissibleVolume(500));
        truckList.add(new Truck().setMaxPermissibleWeight(2000).setMaxPermissibleVolume(1000));
        truckList.add(new Truck().setMaxPermissibleWeight(2500).setMaxPermissibleVolume(1500));
        return truckList;
    }
}
