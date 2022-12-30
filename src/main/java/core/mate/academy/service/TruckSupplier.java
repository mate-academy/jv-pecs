package core.mate.academy.service;

import core.mate.academy.model.ColorSupplier;
import core.mate.academy.model.Machine;
import core.mate.academy.model.ModelSupplier;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckSupplier implements MachineProducer<Machine> {
    private ModelSupplier modelSupplier = new ModelSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private List<Machine> listOfTrucks = new ArrayList<>();

    public Truck getTruck() {
        int towingCapacity = random.nextInt(5) * 10;
        return new Truck(modelSupplier.getModel().toString(),
                colorSupplier.getColor().toString(), towingCapacity);
    }

    @Override
    public List<Machine> get() {
        TruckSupplier truck = new TruckSupplier();
        for (int i = 0; i < 4; i++) {
            listOfTrucks.add(truck.getTruck());
        }
        return listOfTrucks;
    }
}
