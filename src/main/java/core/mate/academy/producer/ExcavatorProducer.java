package core.mate.academy.producer;

import core.mate.academy.enums.OperationalPurposes;
import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> produce() {

        int index = new Random().nextInt(OperationalPurposes.values().length);

        Excavator excavatorHitachi = new Excavator();
        excavatorHitachi.setOperationalPurpose(OperationalPurposes.values()
                [index].toString());
        excavatorHitachi.setColor("Yellow");
        excavatorHitachi.setName("Hitachi");

        Excavator excavatorKomatsu = new Excavator();
        excavatorKomatsu.setOperationalPurpose(OperationalPurposes.values()
                [index].toString());
        excavatorKomatsu.setColor("Green");
        excavatorKomatsu.setName("Komatsu");

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavatorHitachi);
        excavators.add(excavatorKomatsu);

        return excavators;
    }
}
