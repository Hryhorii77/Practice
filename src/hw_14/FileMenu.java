package hw_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileMenu {
    public static void saveDataToFile(String data) {
        try (PrintWriter writer = new PrintWriter("data.txt")) {
            writer.println(data);
            System.out.println("Data is successfully saved in file data.txt");
        } catch (IOException e) {
            System.out.println("An error occured while saving data in file: " + e.getMessage());
        }
    }

    public static String readDataFromFile() {
        StringBuilder data = new StringBuilder();
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            while (scanner.hasNextLine()) {
                data.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File data.txt is not found.");
        }
        return data.toString();
    }
}
