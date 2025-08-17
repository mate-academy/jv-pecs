package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Machine> {
    private final String[] colors = new String[] {"blue", "red", "black", "yellow", "green"};
    private final int colorsCount = colors.length;

    @Override
    public List<Machine> get() {
        List<Machine> result = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            Truck newTruck = new Truck();
            newTruck.setName("Truck_" + i);
            newTruck.setColor(colors[rand.nextInt(colorsCount)]);
            int weightMax = 127000;
            int weightMin = 9000;
            newTruck.setWeight(rand.nextInt(weightMax - weightMin));
            int powerMax = 140;
            int powerMin = 20;
            newTruck.setPower(rand.nextInt(powerMax - powerMin));
            result.add(newTruck);
        }
        return result;
    }
}
