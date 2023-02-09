package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list;

    public TruckProducer() {
        list = new ArrayList<>();
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();

        firstTruck.setName("first");
        secondTruck.setName("second");
        thirdTruck.setName("third");

        firstTruck.setColor("red");
        secondTruck.setColor("blue");
        thirdTruck.setColor("green");
        list.add(firstTruck);
        list.add(secondTruck);
        list.add(thirdTruck);
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
