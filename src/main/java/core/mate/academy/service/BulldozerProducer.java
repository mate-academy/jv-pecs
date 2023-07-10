package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MAX_WEIGHT_KG = 20000;
    private static final int MIN_WEIGHT_KG = 40000;
    private static final int NUMBER_OF_UNITS_TO_PRODUCE = 3;
    private static final String[] colors = {"Yellow", "White", "Green", "Red", "Black"};
    private static final int NUMBER_OF_COLORS = colors.length;
    private Random random = new Random();
    private String randomColor = colors[random.nextInt(NUMBER_OF_COLORS - 1)];
    private int randomWeight = (int) (Math.random() * (MAX_WEIGHT_KG
            - MIN_WEIGHT_KG + 1) + MIN_WEIGHT_KG);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<Bulldozer>();
        for (int i = 0; i < NUMBER_OF_UNITS_TO_PRODUCE; i++) {
            listOfBulldozers.add(new Bulldozer(randomColor,"Caterpillar", randomWeight));
        }
        return listOfBulldozers;
    }
}
