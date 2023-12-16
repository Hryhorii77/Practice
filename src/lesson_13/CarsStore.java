package lesson_13;

import java.util.Calendar;

public class CarsStore {

    String name;

    String address;
    Car []arrCar= new Car[100];
    Employee [] arrayEmployee = new Employee [100];
    int countEmployee = 0;
    int countCar=0;

    public void addCar (Car c1){
        arrCar[countCar] = c1;
        countCar++;
    }

    public void aboutStore () {
        for (int i = 0; i < countCar; i++) {
             arrCar[i].about();
        }
    }
    public void searchToMyPrice (int a, int b){
        for (int i = 0; i < countCar; i++) {
            if (arrCar[i].price > a && arrCar[i].price < b) {
                arrCar[i].about();
            }
        }
    }
    public  void addEmployee (Employee e1) {
        arrayEmployee[countEmployee] = e1;
        countEmployee ++;
    }
    public void employeeInfo (){
        for (int i = 0; i < countEmployee; i++) {
            arrayEmployee[i].about();
        }
    }
    public boolean updateEmployeeSalary (String firstName, int salary ) {
        for (int i = 0; i < countEmployee; i++) {
            if (arrayEmployee[i].firstName.equals(firstName)){
                arrayEmployee[i].salary = salary;
                return true;

            }
        }

        return false;
    }


    public void sellCar (Employee e1, Car c1){{
        e1.addEmployeeCar(c1);
        c1.countCar--;
    }
    }

    public void showEmployeerAge (int age) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < countEmployee; i++) {
            String getFourLastChars = arrayEmployee[i].dateOfBirth.substring(arrayEmployee[i].dateOfBirth.length()-4);
            int ageOfBirth = Integer.parseInt(getFourLastChars);
            int count = year - ageOfBirth;
            if(count > age) {
                arrayEmployee[i].about();
            }
        }
    }
}
