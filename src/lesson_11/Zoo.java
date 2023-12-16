package lesson_11;

public class Zoo {
    Animals[] array = new Animals[500];
    int count = 0;

    public void addAnimals(Animals animals) {
        array[count] = animals;
        count++;
    }

    public void showAnimals() {
        for (int i = 0; i < count; i++) {
            array[i].about();
        }
    }

    public void calculateAvarageAge() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + array[i].age;
        }
        System.out.println(sum / count);
    }

    public void showName(String animals) {
        for (int i = 0; i < count; i++) {
            if (array[i].name .equals(animals)) {
                System.out.println("There is such name");
            }
        }
    }
}
