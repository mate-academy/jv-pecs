package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> truckList = new ArrayList<>();

    @Override
    public List<Truck> get() {
        truckList = createTruckAndInitializeTruckList();
        return truckList;
    }

    private List<Truck> createTruckAndInitializeTruckList() {
        Truck truck1 = new Truck();
        truck1.setName("truck_1");
        truck1.setColor("Black");
        truck1.setTypesBySize("Heavy");
        truck1.setAmountWheels(6);
        truck1.setHasFridge(true);
        Truck truck2 = new Truck();
        truck2.setName("truck_2");
        truck2.setColor("Blue");
        truck2.setTypesBySize("Off-road");
        truck2.setAmountWheels(4);
        truck2.setHasFridge(false);
        truckList.add(truck1);
        truckList.add(truck2);
        return truckList;
    }
}
