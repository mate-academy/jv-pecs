package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineProducer {
    private int liftCapacity;
    private int speed;

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(int liftCapacity) {
        this.liftCapacity = liftCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.liftCapacity = 20;
        truck1.speed = 50;
        truck1.setName("Volvo");
        truck1.setColor("yellow");

        Truck truck2 = new Truck();
        truck2.liftCapacity = 30;
        truck2.speed = 40;
        truck2.setName("MAN");
        truck2.setColor("red");

        Truck truck3 = new Truck();
        truck3.liftCapacity = 35;
        truck3.speed = 35;
        truck3.setName("Komatsu");
        truck3.setColor("grey");

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
