package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private Truck createTruckModel1() {
        Truck truck1 = new Truck();
        truck1.setColor("WHITE");
        truck1.setName("THN54");
        truck1.setHeight(125);
        return truck1;
    }

    private Truck createTruckModel2() {
        Truck truck2 = new Truck();
        truck2.setColor("YELLOW");
        truck2.setName("MDHG98");
        truck2.setHeight(243);
        return truck2;
    }

    @Override
    public List<Machine> get() {
        List<Machine> truckList = new ArrayList<>();
        truckList.add(createTruckModel1());
        truckList.add(createTruckModel2());
        return truckList;
    }
}
