package core.mate.academy.service;

import core.mate.academy.constant.Color;
import core.mate.academy.model.Truck;
import core.mate.academy.util.RandomValue;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private RandomValue randomValue;
    private List<Truck> truckList;

    public TruckProducer() {
        randomValue = new RandomValue();
        this.truckList = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        truckList.add(makeDefaultGreenTruck());
        truckList.add(makeDefaultRedTruck());
        truckList.add(makeDefaultYellowTruck());
        return truckList;
    }

    private Truck makeDefaultGreenTruck() {
        Truck greenTruck = new Truck();
        greenTruck.setName(Truck.class.getName());
        greenTruck.setColor(Color.GREEN.name());
        greenTruck.setTrailerCapacity(randomValue.getRandomValue());
        greenTruck.setTrailerLength(randomValue.getRandomValue());
        return greenTruck;
    }

    private Truck makeDefaultYellowTruck() {
        Truck yellowTruck = new Truck();
        yellowTruck.setName(Truck.class.getName());
        yellowTruck.setColor(Color.YELLOW.name());
        yellowTruck.setTrailerCapacity(randomValue.getRandomValue());
        yellowTruck.setTrailerLength(randomValue.getRandomValue());
        return yellowTruck;
    }

    private Truck makeDefaultRedTruck() {
        Truck redTruck = new Truck();
        redTruck.setName(Truck.class.getName());
        redTruck.setColor(Color.RED.name());
        redTruck.setTrailerCapacity(randomValue.getRandomValue());
        redTruck.setTrailerLength(randomValue.getRandomValue());
        return redTruck;
    }
}
