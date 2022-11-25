package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckFirst = new Truck();
        truckFirst.setColor("Blue");
        truckFirst.setName("MAN");

        Truck truckSecond = new Truck();
        truckSecond.setColor("White");
        truckSecond.setName("DAF");

        Truck truckThird = new Truck();
        truckThird.setColor("Red");
        truckThird.setName("Renault");

        List<Truck> truckList = new ArrayList<>();
        truckList.add(truckFirst);
        truckList.add(truckSecond);
        truckList.add(truckThird);

        return truckList;
    }
}
