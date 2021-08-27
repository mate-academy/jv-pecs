package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck();
        truckOne.setName("smallTruck");
        truckOne.setColor("yellow");
        truckOne.setMaxWeight(1000);
        Truck truckTwo = new Truck();
        truckTwo.setName("middleTruck");
        truckTwo.setColor("blue");
        truckOne.setMaxWeight(2000);
        Truck truckThree = new Truck();
        truckThree.setName("bigTruck");
        truckThree.setColor("green");
        truckThree.setMaxWeight(3000);
        ArrayList<Truck> output = new ArrayList<>();
        output.add(truckOne);
        output.add(truckTwo);
        output.add(truckThree);
        return output;
    }
}
