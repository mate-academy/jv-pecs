package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private Truck firstTruck = new Truck();
    private Truck secondTruck = new Truck();
    private Truck thirdTruck = new Truck();

    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        list.add(firstTruck);
        list.add(secondTruck);
        list.add(thirdTruck);
        return list;
    }
}
