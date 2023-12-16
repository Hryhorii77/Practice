package lesson_16;

import java.util.Objects;

public class Vehicle extends Object{
    private int wheel;
    private String coulour;

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getCoulour() {
        return coulour;
    }

    public void setCoulour(String coulour) {
        this.coulour = coulour;
    }

    public Vehicle(int wheel, String coulour) {
        this.wheel = wheel;
        this.coulour = coulour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheel=" + wheel +
                ", coulour='" + coulour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return wheel == vehicle.wheel && Objects.equals(coulour, vehicle.coulour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheel, coulour);
    }
}
