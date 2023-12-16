package lesson_16;

public class Car {
    private String colour;
    private int price;
    private String model;
    private int wheel;

    public void drive(){
        while (true){
            System.out.print("_");
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public Car(String colour, int price, String model, int wheel) {
        this.colour = colour;
        this.price = price;
        this.model = model;
        this.wheel = wheel;
    }
}
