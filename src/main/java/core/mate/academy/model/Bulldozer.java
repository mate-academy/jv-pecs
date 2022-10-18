package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int specialBulldozerField;

    public Bulldozer() {
    }

    public void setSpecialBulldozerField(int specialBulldozerField) {
        this.specialBulldozerField = specialBulldozerField;
    }

    public int getSpecialBulldozerField() {
        return specialBulldozerField;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
