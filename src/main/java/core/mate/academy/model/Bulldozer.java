package core.mate.academy.model;

import core.mate.academy.model.enums.Blade;

public class Bulldozer extends Machine {
    private Blade blade;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, Blade blade) {
        super(name, color);
        this.blade = blade;
    }

    public Blade getBlade() {
        return blade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
