package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MAX_BUCKET_VELOCITY_LITERS = 1250;
    private static final int MIN_BUCKET_VELOCITY_LITERS = 1000;
    private static final int NUMBER_OF_UNITS_TO_PRODUCE = 3;
    private static final String[] colors = {"Yellow", "White", "Green", "Red", "Black"};
    private static final int NUMBER_OF_COLORS = colors.length;
    private Random random = new Random();
    private String randomColor = colors[random.nextInt(NUMBER_OF_COLORS - 1)];
    private int randomVelocity = (int) (Math.random() * (MAX_BUCKET_VELOCITY_LITERS
            - MIN_BUCKET_VELOCITY_LITERS + 1) + MIN_BUCKET_VELOCITY_LITERS);

    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavators = new ArrayList<Excavator>();
        for (int i = 0; i < NUMBER_OF_UNITS_TO_PRODUCE; i++) {
            listOfExcavators.add(new Excavator(randomColor, "Hitachi", randomVelocity));
        }
        return listOfExcavators;
    }
}
