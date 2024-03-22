package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Random random = new Random();
    private final List<Excavator> excavatorList = new ArrayList<>();

    public ExcavatorProducer() {
        init(excavatorList);
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }

    private void init(List<Excavator> list) {
        for (int i = 0; i < 10; i++) {
            Excavator excavator = new Excavator(i);
            excavator.setName("OP" + i + "WR");
            excavator.setColor(generateRandomColor());
            list.add(excavator);
        }
    }

    private String generateRandomColor() {
        int randomNumber = random.nextInt(3);
        return switch (randomNumber) {
            case 0 -> "black";
            case 1 -> "green";
            case 2 -> "red";
            default -> null;
        };
    }
}
