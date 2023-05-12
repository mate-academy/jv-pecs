package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final String[] truckNames = {"Daf", "Man"};
    private final String[] truckColors = {"White", "Green"};

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < truckNames.length; i++) {
            Truck truck = new Truck();
            truck.setName(truckNames[i]);
            truck.setColor(truckColors[i]);
            trucks.add(truck);
        }
        return trucks;
    }
}
