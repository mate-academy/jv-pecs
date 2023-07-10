package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_UNITS_TO_PRODUCE = 3;
    private static final int MAX_WHEEL_AXIS = 6;
    private static final int MIN_WHEEL_AXIS = 2;
    private static final String[] colors = {"Yellow", "White", "Green", "Red", "Black"};
    private static final int NUMBER_OF_COLORS = colors.length;
    private Random random = new Random();
    private String randomColor = colors[random.nextInt(NUMBER_OF_COLORS - 1)];
    private int randomVelocity = (int) (Math.random() * (MAX_WHEEL_AXIS
            - MIN_WHEEL_AXIS + 1) + MIN_WHEEL_AXIS);

    @Override
    public List<Truck> get() {
        List<Truck> listOfTrucks = new ArrayList<Truck>();
        for (int i = 0; i < NUMBER_OF_UNITS_TO_PRODUCE; i++) {
            listOfTrucks.add(new Truck(randomColor, "Man", randomVelocity));
        }
        return listOfTrucks;
    }
}
