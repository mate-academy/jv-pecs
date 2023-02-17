package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements MachineProducer<Excavator> {
    private String originCountry;
    private int weight;

    public Excavator() {
    }

    public Excavator(String name, String color,String originCountry, int weight) {
        super(name, color);
        this.originCountry = originCountry;
        this.weight = weight;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Excavator> get() {
        Excavator himars = new Excavator("RSZO", "Green", "USA",10866);
        Excavator olha = new Excavator("RSZO", "Piksel","Ukraine",7000);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(himars);
        excavators.add(olha);
        return excavators;
    }
}
