import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.BulldozerProducer;

public class Main {
    public static void main(String[] args) {
        BulldozerProducer producer = new BulldozerProducer();
        for (Bulldozer bulldozer : producer.get()) {
            System.out.println(bulldozer.getClass());
        }
    }
}
