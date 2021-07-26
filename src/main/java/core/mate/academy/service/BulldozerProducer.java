package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {

        List<Bulldozer> list = new ArrayList<>();

        int randomSize = new Random().nextInt(20);
        for (int i = 0; i < randomSize; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setBladeToTheFront(new Random().nextBoolean());
            bulldozer.setName("Bull" + i);
            bulldozer.setTracksType((new Random().nextBoolean()) ? "Swamp" : "Wheels");
            list.add(bulldozer);
        }
        return list;
    }
}
