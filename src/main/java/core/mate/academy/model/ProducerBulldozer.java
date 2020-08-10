package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ProducerBulldozer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer(10000,"Crawler");
        List<Bulldozer> answer = new ArrayList<>();
        answer.add(firstBulldozer);
        answer.add(secondBulldozer);
        return answer;
    }
}
