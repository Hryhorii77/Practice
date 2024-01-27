package lesson_23;

import java.util.Objects;

public class Plane {
    int hex;
    int seats;
    int height;
    int weight;
    String colour;

    public Plane(int hex, int seats, int height, int weight, String colour) {
        this.hex = hex;
        this.seats = seats;
        this.height = height;
        this.weight = weight;
        this.colour = colour;
    }

    public int getHex() {
        return hex;
    }

    public void setHex(int hex) {
        this.hex = hex;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "hex=" + hex +
                ", seats=" + seats +
                ", height=" + height +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return hex == plane.hex && seats == plane.seats && height == plane.height && weight == plane.weight && Objects.equals(colour, plane.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hex, seats, height, weight, colour);
    }
}
