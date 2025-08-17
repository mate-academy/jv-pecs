package core.mate.academy.model;

public class Excavator extends Machine {
    private int graduationYear;

    public Excavator() {
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
