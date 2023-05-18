package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        final List<Truck> truckList = new ArrayList<>();
        Truck truckThirst = new Truck();
        truckThirst.setName("first");
        truckThirst.setColor("White");
        truckThirst.setMaxSpeed(70);
        truckThirst.setFuelVolume(300);

        Truck truckSecond = new Truck();
        truckSecond.setName("second");
        truckSecond.setColor("Blsck");
        truckSecond.setMaxSpeed(80);
        truckSecond.setFuelVolume(400);

        Truck truckThird = new Truck();
        truckThird.setName("third");
        truckThird.setColor("Blue");
        truckThird.setMaxSpeed(80);
        truckThird.setFuelVolume(400);

        truckList.add(truckThirst);
        truckList.add(truckSecond);
        truckList.add(truckThird);

        return truckList;
    }
}
