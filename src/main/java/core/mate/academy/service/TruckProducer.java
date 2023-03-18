package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private Truck truck1 = new Truck("Volvo", 12.8, 5000);
    private Truck truck2 = new Truck("MAN", 16.2, 5500);
    private Truck truck3 = new Truck("Mercedes", 10.4, 4000);
    private List<Truck> trucksList = List.of(truck1, truck2, truck3);

    public Truck getTruck1() {
        return truck1;
    }

    public void setTruck1(Truck truck1) {
        this.truck1 = truck1;
    }

    public Truck getTruck2() {
        return truck2;
    }

    public void setTruck2(Truck truck2) {
        this.truck2 = truck2;
    }

    public Truck getTruck3() {
        return truck3;
    }

    public void setTruck3(Truck truck3) {
        this.truck3 = truck3;
    }

    public List<Truck> getTrucksList() {
        return trucksList;
    }

    public void setTrucksList(List<Truck> trucksList) {
        this.trucksList = trucksList;
    }

    @Override
    public List<Truck> get() {
        return trucksList;
    }
}
