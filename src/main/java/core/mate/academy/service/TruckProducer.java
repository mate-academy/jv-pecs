package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        firstTruck.setName("Ford");
        firstTruck.setColor("blue");
        firstTruck.setCab("fordCab");
        firstTruck.setFrame("fordFrame");

        Truck secondTruck = new Truck();
        secondTruck.setName("Volvo");
        secondTruck.setColor("white");
        secondTruck.setCab("volvoCab");
        secondTruck.setFrame("volvoCab");

        Truck thirdTruck = new Truck();
        thirdTruck.setName("Freightliner");
        thirdTruck.setColor("black");
        thirdTruck.setCab("freightlinerCab");
        thirdTruck.setFrame("freightlinerFrame");

        List<Truck> truckList = new ArrayList<>();
        truckList.add(thirdTruck);
        truckList.add(secondTruck);
        truckList.add(firstTruck);

        return truckList;
    }
}
