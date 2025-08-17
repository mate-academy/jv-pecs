package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private Random random = new Random();
    private final List<Truck> truckList = new ArrayList<>();

    public TruckProducer() {
        init(truckList);
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }

    private void init(List<Truck> list) {
        for (int i = 0; i < 10; i++) {
            Truck truck = new Truck(i);
            truck.setName("OP" + i + "WR");
            truck.setColor(generateRandomColor());
            list.add(truck);
        }
    }

    private String generateRandomColor() {
        int randomNumber = random.nextInt(3);
        return switch (randomNumber) {
            case 0 -> "black";
            case 1 -> "white";
            case 2 -> "red";
            default -> null;
        };
    }
}
