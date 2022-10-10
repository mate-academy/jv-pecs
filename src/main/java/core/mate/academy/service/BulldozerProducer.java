package core.mate.academy.service;

import core.mate.academy.constant.Color;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.util.RandomValue;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private RandomValue randomValue;
    private Bulldozer greenBulldozer;
    private Bulldozer yellowBulldozer;
    private Bulldozer redBulldozer;
    private final List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        randomValue = new RandomValue();
        bulldozerList = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        init();
        bulldozerList.add(greenBulldozer);
        bulldozerList.add(yellowBulldozer);
        bulldozerList.add(redBulldozer);
        return bulldozerList;
    }

    @Override
    public void init() {
        greenBulldozer = new Bulldozer();
        greenBulldozer.setColor(Color.GREEN.name());
        greenBulldozer.setName(Bulldozer.class.getName());
        greenBulldozer.setLengthOfCrawler(randomValue.getRandomValue());
        greenBulldozer.setWeightBucket(randomValue.getRandomValue());
        yellowBulldozer = new Bulldozer();
        yellowBulldozer.setColor(Color.YELLOW.name());
        yellowBulldozer.setName(Bulldozer.class.getName());
        yellowBulldozer.setLengthOfCrawler(randomValue.getRandomValue());
        yellowBulldozer.setWeightBucket(randomValue.getRandomValue());
        redBulldozer = new Bulldozer();
        redBulldozer.setColor(Color.RED.name());
        redBulldozer.setName(Bulldozer.class.getName());
        redBulldozer.setLengthOfCrawler(randomValue.getRandomValue());
        redBulldozer.setWeightBucket(randomValue.getRandomValue());
    }
}
