package core.mate.academy.service;

import core.mate.academy.constant.Color;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.util.RandomValueService;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private RandomValueService randomValue;
    private final List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        randomValue = new RandomValueService();
        bulldozerList = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        bulldozerList.add(makeDefaultGreenBulldozer());
        bulldozerList.add(makeDefaultYellowBulldozer());
        bulldozerList.add(makeDefaultRedBulldozer());
        return bulldozerList;
    }

    private Bulldozer makeDefaultGreenBulldozer() {
        Bulldozer greenBulldozer = new Bulldozer();
        greenBulldozer.setColor(Color.GREEN.name());
        greenBulldozer.setName(Bulldozer.class.getName());
        greenBulldozer.setLengthOfCrawler(randomValue.getRandomValue());
        greenBulldozer.setWeightBucket(randomValue.getRandomValue());
        return greenBulldozer;
    }

    private Bulldozer makeDefaultYellowBulldozer() {
        Bulldozer yellowBulldozer = new Bulldozer();
        yellowBulldozer.setColor(Color.YELLOW.name());
        yellowBulldozer.setName(Bulldozer.class.getName());
        yellowBulldozer.setLengthOfCrawler(randomValue.getRandomValue());
        yellowBulldozer.setWeightBucket(randomValue.getRandomValue());
        return yellowBulldozer;
    }

    private Bulldozer makeDefaultRedBulldozer() {
        Bulldozer redBulldozer = new Bulldozer();
        redBulldozer.setColor(Color.RED.name());
        redBulldozer.setName(Bulldozer.class.getName());
        redBulldozer.setLengthOfCrawler(randomValue.getRandomValue());
        redBulldozer.setWeightBucket(randomValue.getRandomValue());
        return redBulldozer;
    }
}
