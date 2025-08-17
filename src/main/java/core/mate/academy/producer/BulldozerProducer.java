package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> produce() {
        Bulldozer volvo = new Bulldozer();
        volvo.setType("L120G");
        volvo.setEnginePower(200);
        volvo.setWeight(21600);
        volvo.setBucketCapacity(1.3);
        volvo.setName("Volvo");
        volvo.setColor("Red");

        Bulldozer caterpillar = new Bulldozer();
        caterpillar.setType("323FL");
        caterpillar.setEnginePower(122);
        caterpillar.setWeight(22600);
        caterpillar.setBucketCapacity(3.3);
        caterpillar.setName("Caterpillar");
        caterpillar.setColor("Brown");

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(volvo);
        bulldozers.add(caterpillar);
        return bulldozers;
    }

}
