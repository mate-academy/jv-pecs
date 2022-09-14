package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck();
        truckOne.setName("TruckOne");
        truckOne.setColor("Black");
        Truck truckTwo = new Truck();
        truckTwo.setName("TruckTwo");
        truckTwo.setColor("Red");
        Truck truckThree = new Truck();
        truckThree.setName("TruckThree");
        truckThree.setColor("Green");
        return List.of(truckOne, truckTwo, truckThree);
    }
}
