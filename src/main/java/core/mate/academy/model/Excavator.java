package core.mate.academy.model;

public class Excavator extends Machine {
    private int yearService;
    private String size;

    public Excavator(int yearService, String size) {
        this.yearService = yearService;
        this.size = size;
    }

    public Excavator() {
    }

    public int getYearService() {
        return yearService;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
