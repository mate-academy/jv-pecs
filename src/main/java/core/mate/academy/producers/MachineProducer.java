package core.mate.academy.producers;

import java.util.List;
import java.util.Random;

public interface MachineProducer<T> {
    Random random = new Random();

    List<T> get();

    default int getRandomNum() {
        return random.nextInt(0, 100);
    }
}
