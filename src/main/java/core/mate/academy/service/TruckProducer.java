package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("MAN", "S90", "Deutchland", 450));
        truckList.add(new Truck("Volvo", "W40", "Sweden", 430));
        truckList.add(new Truck("DAF", "VR67U", "Netherlands", 480));
        return truckList;
    }
}
