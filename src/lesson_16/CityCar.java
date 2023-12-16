package lesson_16;

public class CityCar extends Car {
    @Override
    public void drive() {
        while (true){
            System.out.print("Fast");
            try{
                Thread.sleep(10);
            }catch (Exception e){

            }
        }
    }


    public CityCar(String colour, int price, String model, int wheel) {
        super(colour, price, model, wheel);

    }
}
