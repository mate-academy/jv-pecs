package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomService {
    private final Random random = new Random();

    private int getRandomInt(int from, int to) {
        return random.nextInt(to - from) + from;
    }

    private double getRandomDouble(int from, int to) {
        return from + (to - from) * random.nextDouble();
    }

    private char getRandomLetter() {
        return (char) getRandomInt(97, 122);
    }

    private char getRandomNumber() {
        return (char) getRandomInt(48, 57);
    }

    private String getRandomName() {
        StringBuilder res = new StringBuilder();
        int size = getRandomInt(3, 8);
        for (int i = 0; i < size; i++) {
            res.append(getRandomLetter());
        }
        return res.append("-").append(getRandomNumber()).toString();
    }

    private String getRandomColor() {
        return Constants.COLORS[getRandomInt(0, Constants.COLORS.length - 1)];
    }

    public List<Bulldozer> getBulldozerList(int number) {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            bulldozers.add(getRandomBulldozer());
        }
        return bulldozers;
    }

    public List<Truck> getTruckList(int number) {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            trucks.add(getRandomTruck());
        }
        return trucks;
    }

    public List<Excavator> getExcavatorList(int number) {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            excavators.add(getRandomExcavator());
        }
        return excavators;
    }

    private Excavator getRandomExcavator() {
        return new Excavator(getRandomName(), getRandomColor(), getRandomDouble(1, 10), getRandomInt(1, 50));
    }

    private Truck getRandomTruck() {
        return new Truck(getRandomName(), getRandomColor(), getRandomDouble(1, 100), getRandomInt(4, 16));
    }

    private Bulldozer getRandomBulldozer() {
        return new Bulldozer(getRandomName(), getRandomColor(), getRandomDouble(1, 10), getRandomDouble(1, 5), getRandomDouble(1, 10));
    }
}
