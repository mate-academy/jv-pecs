package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer<T extends Bulldozer> implements MachineProducer<T>{
    private final String[] colors = new String[]{"red", "blue", "black",
            "orange", "grey", "green", "yellow"};
    private final String[] names = new String[]{"Volvo", "Freightliner", "Peterbilt",
            "JCB", "KOMATSU", "HITACHI", "CAT"};
    private final String[] chassis = new String[]{"crawler", "wheeled"};
    private final Random random = new Random();

    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> list = new ArrayList<Bulldozer>();
        for (int i = 0; i < 3; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setChassis(chassis[random.nextInt(2)]);
            bulldozer.setName(names[random.nextInt(7)]);
            bulldozer.setColor(colors[random.nextInt(7)]);
            list.add(bulldozer);
        }
        return list;
    }
}
