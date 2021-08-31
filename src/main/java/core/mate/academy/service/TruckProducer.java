package core.mate.academy.service;


import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer<T extends Truck> implements MachineProducer<T> {
    private final String[] colors = new String[]{"red", "blue", "black",
            "orange", "grey", "green", "yellow"};
    private final String[] names = new String[]{"Volvo", "Freightliner", "Peterbilt",
            "JCB", "KOMATSU", "HITACHI", "CAT"};
    private final int[] loadCapacity = new int[]{5, 10, 20};
    private final Random random = new Random();


    @Override
    public List<? extends Machine> get() {
        List<Truck> list = new ArrayList<Truck>();
        for (int i = 0; i < 3; i++) {
            Truck truck = new Truck();
            truck.setLoadCapacity(loadCapacity[random.nextInt(3)]);
            truck.setName(names[random.nextInt(7)]);
            truck.setColor(colors[random.nextInt(7)]);
            list.add(truck);
        }
        return list;
    }
}
