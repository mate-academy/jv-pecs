package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        firstTruck.setPower(1000);
        firstTruck.setColor("Red");
        firstTruck.setName("FirstTruck");
        Truck secondTruck = new Truck();
        secondTruck.setPower(800);
        secondTruck.setColor("Yellow");
        secondTruck.setName("SecondTruck");
        Truck thirdTruck = new Truck();
        thirdTruck.setPower(900);
        thirdTruck.setColor("Blue");
        thirdTruck.setName("ThirdTruck");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
