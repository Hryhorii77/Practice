package lesson_10;

public class ProductStore {
    Product[]arr = new Product[10];
    int count=0;

    public void addElement(Product people){
        arr[count]=people;
        count++;
    }

}
