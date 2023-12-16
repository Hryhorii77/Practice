package hw_15.part1;

public class Kitchen extends Room {
    public int latitude;

    public Kitchen(String name, int height, String colour, int latitude) {
        super(name, height, colour);
        this.latitude = latitude;
    }
}
