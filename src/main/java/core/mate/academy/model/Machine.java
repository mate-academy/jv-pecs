package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String mark;
    private String color;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getFunction() {
        return color;
    }

    public void setFunction(String function) {
        this.color = function;
    }
}
