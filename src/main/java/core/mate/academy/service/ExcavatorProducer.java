package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int EXCAVATORS_AMOUNT = 3;
    private final String[] excavatorCompanies = { "Caterpillar", "Komatsu", "John Deere", "Bobcat",
            "JCB", "Doosan", "Hyundai", "Volvo", "Hitach" };
    private Random random = new Random();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        String excavatorName;
        String excavatorColor;
        for (int i = 0; i < EXCAVATORS_AMOUNT; i++) {
            excavatorName = excavatorCompanies[random.nextInt(excavatorCompanies.length)];
            excavatorColor = Color.values()[random.nextInt(Color.values().length)].name();
            excavators.add(new Excavator(excavatorName, excavatorColor, random.nextBoolean(),
                    random.nextBoolean()));
        }
        return excavators;
    }
}
