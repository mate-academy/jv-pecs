package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> truckList = new ArrayList<>();
        truckList.add(new Truck(10,"Refrigerator"));
        truckList.add(new Truck(20,"Tent"));
        truckList.add(new Truck(5,"Whole metal trailer"));
        return truckList;
    }
}
