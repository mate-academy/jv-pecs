package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    public static final List<Truck> TRUCK_ARRAY_LIST = new ArrayList<>();

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        firstTruck.setName("Ford");
        firstTruck.setColor("blue");
        firstTruck.setCab("fordCab");
        firstTruck.setFrame("fordFrame");
        TRUCK_ARRAY_LIST.add(firstTruck);
        Truck secondTruck = new Truck();
        secondTruck.setName("Volvo");
        secondTruck.setColor("white");
        secondTruck.setCab("volvoCab");
        secondTruck.setFrame("volvoCab");
        TRUCK_ARRAY_LIST.add(secondTruck);
        Truck thirdTruck = new Truck();
        thirdTruck.setName("Freightliner");
        thirdTruck.setColor("black");
        thirdTruck.setCab("freightlinerCab");
        thirdTruck.setFrame("freightlinerFrame");
        TRUCK_ARRAY_LIST.add(thirdTruck);
        return TRUCK_ARRAY_LIST;
    }
}
