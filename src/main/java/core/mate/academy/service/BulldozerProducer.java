package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Random random = new Random();
    private final List<Bulldozer> bulldozerList = new ArrayList<>();

    public BulldozerProducer() {
        init(bulldozerList);
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }

    private void init(List<Bulldozer> list) {
        for (int i = 0; i < 10; i++) {
            Bulldozer bulldozer = new Bulldozer(i);
            bulldozer.setName("OP" + i + "WR");
            bulldozer.setColor(generateRandomColor());
            list.add(bulldozer);
        }
    }

    private String generateRandomColor() {
        int randomNumber = random.nextInt(3);
        return switch (randomNumber) {
            case 0 -> "black";
            case 1 -> "white";
            case 2 -> "purple";
            default -> null;
        };
    }
}
