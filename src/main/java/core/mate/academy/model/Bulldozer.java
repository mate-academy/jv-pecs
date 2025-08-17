package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String color;
    private int horsepower;
    private String mark;

    public Bulldozer(String color, int powerEngene, String mark) {
        this.color = color;
        this.horsepower = powerEngene;
        this.mark = mark;
    }

    public Bulldozer() {
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
