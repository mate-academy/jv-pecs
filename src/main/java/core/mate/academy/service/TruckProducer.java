package core.mate.academy.service;

import core.mate.academy.constant.Color;
import core.mate.academy.model.Truck;
import core.mate.academy.util.RandomValue;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private RandomValue randomValue;
    private Truck greenTruck;
    private Truck yellowTruck;
    private Truck redTruck;
    private List<Truck> truckList;

    public TruckProducer() {
        randomValue = new RandomValue();
        this.truckList = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        init();
        truckList.add(greenTruck);
        truckList.add(yellowTruck);
        truckList.add(redTruck);
        return truckList;
    }

    @Override
    public void init() {
        greenTruck = new Truck();
        greenTruck.setName(Truck.class.getName());
        greenTruck.setColor(Color.GREEN.name());
        greenTruck.setTrailerCapacity(randomValue.getRandomValue());
        greenTruck.setTrailerLength(randomValue.getRandomValue());
        yellowTruck = new Truck();
        yellowTruck.setName(Truck.class.getName());
        yellowTruck.setColor(Color.YELLOW.name());
        yellowTruck.setTrailerCapacity(randomValue.getRandomValue());
        yellowTruck.setTrailerLength(randomValue.getRandomValue());
        redTruck = new Truck();
        redTruck.setName(Truck.class.getName());
        redTruck.setColor(Color.RED.name());
        redTruck.setTrailerCapacity(randomValue.getRandomValue());
        redTruck.setTrailerLength(randomValue.getRandomValue());
    }
}
