package hw_15.part1;

public class Bathroom extends Room {
    public String floorColour;

    public Bathroom(String name, int height, String colour, String floorColour) {
        super(name, height, colour);
        this.floorColour = floorColour;
    }
}
