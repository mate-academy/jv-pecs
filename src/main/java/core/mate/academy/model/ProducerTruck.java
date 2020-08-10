package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ProducerTruck implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track firstTrack = new Track();
        Track secondTrack = new Track(300000,590000);
        List<Track> answer = new ArrayList<>();
        answer.add(firstTrack);
        answer.add(secondTrack);
        return answer;
    }
}
