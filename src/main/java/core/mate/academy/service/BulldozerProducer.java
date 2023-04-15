package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    public static final String FIRST_COLOR = "White";
    public static final String SECOND_COLOR = "Yellow";
    public static final String THIRD_COLOR = "Red";
    public static final String FIRST_NAME = "Caterpillar";
    public static final String SECOND_NAME = "Liebherr";
    public static final String THIRD_NAME = "Komatsu";
    private List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        bulldozerList = new ArrayList<>();
        bulldozerList.add(produceBulldozer(FIRST_COLOR, FIRST_NAME));
        bulldozerList.add(produceBulldozer(SECOND_COLOR, SECOND_NAME));
        bulldozerList.add(produceBulldozer(THIRD_COLOR, THIRD_NAME));
    }

    private Bulldozer produceBulldozer(String color, String name) {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setColor(color);
        bulldozer.setName(name);
        return bulldozer;
    }

    @Override
    public List<Bulldozer> get() {
        return this.bulldozerList;
    }
}
