package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorSupplier implements MachineProducer<Machine> {
    private ModelSupplier modelSupplier = new ModelSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private List<Machine> listOfExcavators = new ArrayList<>();

    public Excavator getExcavator() {
        int randomHeight = random.nextInt(6);
        return new Excavator(modelSupplier.getModel().toString(),
                colorSupplier.getColor().toString(), randomHeight);
    }

    @Override
    public List<Machine> get() {
        ExcavatorSupplier excavator = new ExcavatorSupplier();
        for (int i = 0; i < 4; i++) {
            listOfExcavators.add(excavator.getExcavator());
        }
        return listOfExcavators;
    }
}
