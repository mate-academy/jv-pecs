package core.mate.academy.model;

import core.mate.academy.model.enums.Blade;

public class Bulldozer extends Machine {
    private Blade blade;

    public Bulldozer() {
    }

    public Blade getBlade() {
        return blade;
    }

    public void setBlade(Blade blade) {
        this.blade = blade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
