package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int BULDOZERS_AMOUNT = 7;
    private static final int MIN_YEAR = 1923;
    private static final int MAX_YEAR = 2023;
    private final String[] bulldozerCompanies = { "Shantui", "John Deere", "Komatsu",
            "Caterpillar", "LiuGong" };
    private Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        String bulldozerName;
        String bulldozerColor;
        for (int i = 0; i < BULDOZERS_AMOUNT; i++) {
            bulldozerName = bulldozerCompanies[random.nextInt(bulldozerCompanies.length)];
            bulldozerColor = Color.values()[random.nextInt(Color.values().length)].name();
            bulldozers.add(new Bulldozer(bulldozerName, bulldozerColor,
                    MIN_YEAR + random.nextInt((MAX_YEAR - MIN_YEAR) + 1)));
        }
        return bulldozers;
    }
}
