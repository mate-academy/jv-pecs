package core.mate.academy.service;

import static core.mate.academy.model.Constants.MAX_BULLDOZER_BLADE_WIDTH;
import static core.mate.academy.model.Constants.MAX_BULLDOZER_HEIGHT;
import static core.mate.academy.model.Constants.MAX_BULLDOZER_WEIGHT;
import static core.mate.academy.model.Constants.MAX_EXCAVATOR_BUCKET_VOLUME;
import static core.mate.academy.model.Constants.MAX_EXCAVATOR_DIGGING_DEPTH;
import static core.mate.academy.model.Constants.MAX_TRUCK_CARGO_WEIGHT;
import static core.mate.academy.model.Constants.MAX_TRUCK_WHEEL_NUM;
import static core.mate.academy.model.Constants.MIN_BULLDOZER_BLADE_WIDTH;
import static core.mate.academy.model.Constants.MIN_BULLDOZER_HEIGHT;
import static core.mate.academy.model.Constants.MIN_BULLDOZER_WEIGHT;
import static core.mate.academy.model.Constants.MIN_EXCAVATOR_BUCKET_VOLUME;
import static core.mate.academy.model.Constants.MIN_EXCAVATOR_DIGGING_DEPTH;
import static core.mate.academy.model.Constants.MIN_TRUCK_CARGO_WEIGHT;
import static core.mate.academy.model.Constants.MIN_TRUCK_WHEEL_NUM;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Constants;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomService {
    private final Random random = new Random();

    private int getRandomInt(int from, int to) {
        return random.nextInt(to - from) + from;
    }

    private double getRandomDouble(double from, double to) {
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
        return Constants.COLORS[getRandomInt(0, Constants.COLORS.length)];
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
        return new Excavator(getRandomName(),
                getRandomColor(),
                getRandomDouble(MIN_EXCAVATOR_BUCKET_VOLUME, MAX_EXCAVATOR_BUCKET_VOLUME),
                getRandomInt(MIN_EXCAVATOR_DIGGING_DEPTH, MAX_EXCAVATOR_DIGGING_DEPTH));
    }

    private Truck getRandomTruck() {
        return new Truck(getRandomName(),
                getRandomColor(),
                getRandomDouble(MIN_TRUCK_CARGO_WEIGHT, MAX_TRUCK_CARGO_WEIGHT),
                getRandomInt(MIN_TRUCK_WHEEL_NUM, MAX_TRUCK_WHEEL_NUM));
    }

    private Bulldozer getRandomBulldozer() {
        return new Bulldozer(getRandomName(),
                getRandomColor(),
                getRandomDouble(MIN_BULLDOZER_WEIGHT, MAX_BULLDOZER_WEIGHT),
                getRandomDouble(MIN_BULLDOZER_HEIGHT, MAX_BULLDOZER_HEIGHT),
                getRandomDouble(MIN_BULLDOZER_BLADE_WIDTH, MAX_BULLDOZER_BLADE_WIDTH));
    }
}
