package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<E> implements MachineProducer<E> {
    @Override
    public List<? extends Machine> get() {
        Truck firstTruck = new Truck();
        firstTruck.setColor("green");
        firstTruck.setName("LAZ");
        firstTruck.setWheels(4);

        Truck secondTruck = new Truck();
        secondTruck.setColor("purple");
        secondTruck.setName("IFA");
        secondTruck.setWheels(6);

        Truck thirdTruck = new Truck();
        thirdTruck.setColor("grey");
        thirdTruck.setName("Star");
        thirdTruck.setWheels(10);

        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(firstTruck);
        trucks.add(secondTruck);
        trucks.add(thirdTruck);
        return trucks;
    }
}
