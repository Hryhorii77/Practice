package lesson_10;

public class Main {
    public static void main(String[] args) {
        ProductStore ps1= new ProductStore();

        Product p1 = new Product();
        p1.name  = "Cola";
        p1.age =  12;
        Product p2 = new Product();
        p2.name = "Pepsi";
        p2.age = 15;

        ps1.addElement(p1);
        ps1.addElement(p2);

    }
}
