package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.ColorSupplier;
import core.mate.academy.model.Machine;
import core.mate.academy.model.ModelSupplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerSupplier implements MachineProducer<Machine> {
    private ModelSupplier modelSupplier = new ModelSupplier();
    private ColorSupplier colorSupllier = new ColorSupplier();
    private Random random = new Random();
    private List<Machine> listOfBulls = new ArrayList<>();

    public Bulldozer getBulldozer() {
        int bucketVolume = random.nextInt(10);
        return new Bulldozer(modelSupplier.getModel().toString(),
                colorSupllier.getColor().toString(), bucketVolume);
    }

    @Override
    public List<Machine> get() {
        BulldozerSupplier bulldozer = new BulldozerSupplier();
        for (int i = 0; i < 4; i++) {
            listOfBulls.add(bulldozer.getBulldozer());
        }
        return listOfBulls;
    }
}
