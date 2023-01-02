package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Machine> get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();

        List<Machine> list = new ArrayList<>();
        list.add(firstTruck);
        list.add(secondTruck);
        list.add(thirdTruck);
        return list;
    }
}
