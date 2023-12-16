package lesson_12;

public class Bathroom {
    public String name;
    public int square;

    public int latitude;
    public int longtitude;

    public Bathroom(String name, int latitude, int longtitude) {
        this.name = name;
        this.square = latitude * longtitude;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }
    public void about () {
        System.out.println(this.name + " " + this.square);
    }
}
