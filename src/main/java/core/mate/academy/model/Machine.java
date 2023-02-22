package core.mate.academy.model;

import java.util.Objects;

public abstract class Machine implements Workable {
    private String name;
    private String color;

    public Machine(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Machine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Machine{" + "name='" + name + '\'' + ", color='" + color + '\'' + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Machine machine = (Machine) object;
        return Objects.equals(name, machine.name) && Objects.equals(color, machine.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
