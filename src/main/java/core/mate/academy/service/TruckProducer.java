package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private String truckName1 = "Chornonog";
    private String truckName2 = "Kombinate";
    private String truckColor1 = "Pink";
    private String truckColor2 = "White";
    private int truckMaxSpeed1 = 80;
    private int truckMaxSpeed2 = 74;
    private int truckWeight1 = 115;
    private int truckWeight2 = 140;

    public List<Truck> get() {
        Truck truck1 = new Truck(truckName1, truckColor1, truckMaxSpeed1, truckWeight1);
        Truck truck2 = new Truck(truckName2, truckColor2, truckMaxSpeed2, truckWeight2);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
