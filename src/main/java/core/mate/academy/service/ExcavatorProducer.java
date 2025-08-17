package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUM_OF_EXCAVATOR = 3;
    private List<Excavator> list = new ArrayList<>();

    public ExcavatorProducer() {
        Random random = new Random();

        for (int i = 0; i < NUM_OF_EXCAVATOR; i++) {
            list.add(new Excavator(random.nextDouble(5)));
        }

    }

    public ExcavatorProducer(List<Excavator> list) {
        this.list = list;
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
