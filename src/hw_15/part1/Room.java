package hw_15.part1;

public class Room {

    private String name;
    private int height;
    private String colour;

    public Room(String name, int height, String colour) {
        this.name = name;
        this.height = height;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
