package lesson_18;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> array1 = new ArrayList<>();

    public void addAnimals(Animal a1) {
        array1.add(a1);
    }

    public ArrayList<Animal> getArray1() {
        return array1;
    }

    public boolean showResult(String name) {
        for (int i = 0; i < array1.size(); i++) {
            if (name.equals(array1.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean deleteName(String name) {
        for (int i = 0; i < array1.size(); i++) {
            if (name.equals(array1.get(i).getName())) {
                array1.remove(i);
                return true;
            }
        }
        return false;
    }
    public void edit(String name, int age){
        for (int i = 0; i < array1.size(); i++) {
            if(name.equals(array1.get(i).getName())){
                array1.get(i).setAge(age);
            }
        }
    }
    public void edit(String name, String color){
        for (int i = 0; i < array1.size(); i++) {
            if(name.equals(array1.get(i).getName())){
                array1.get(i).setColour(color);
            }
        }
    }

}
