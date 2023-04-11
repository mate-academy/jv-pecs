package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck();
    private Truck truck2 = new Truck("middle", 6);
    private Truck truck3 = new Truck("strong", 8);

    public Truck getTruck1() {
        return truck1;
    }

    public Truck getTruck2() {
        return truck2;
    }

    public Truck getTruck3() {
        return truck3;
    }

    public void setTruck1(Truck truck1) {
        this.truck1 = truck1;
    }

    public void setTruck2(Truck truck2) {
        this.truck2 = truck2;
    }

    public void setTruck3(Truck truck3) {
        this.truck3 = truck3;
    }

    @Override
    public List<Truck> get() {
        ArrayList<Truck> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(truck1);
        listOfTrucks.add(truck2);
        listOfTrucks.add(truck3);
        return listOfTrucks;
    }
}
