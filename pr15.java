package pr14;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pr15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1: Запись информации с клавиатуры в файл
        try (FileWriter writer = new FileWriter("C:\\users\\i212\\input.txt")) {
            System.out.println("Задача 1: Введите текст для записи в файл (Ctrl+D для завершения):");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Данные записаны в файл.");
        } catch (IOException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }

        // Задание 2: Чтение информации из файла и вывод на экран
        try (FileReader reader = new FileReader("C:\\users\\i212\\input.txt")) {
            int c;
            System.out.println("\nЗадача 2: Данные, прочитанные из файла:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }

        /* Задание 3: Замена информации в файле на введенную с клавиатуры
        try (FileWriter writer = new FileWriter("C:\\users\\i212\\input.txt");
             FileReader reader = new FileReader("C:\\users\\i212\\input.txt")) {

            System.out.println("\nЗадача 3: Введите новый текст для замены существующего содержимого в файле:");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Данные заменены в файле.");
        } catch (IOException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }

        // Задание 4: Добавление в конец исходного файла текста, введенного с клавиатуры
        try (FileWriter writer = new FileWriter("C:\\users\\i212\\input.txt", true)) {
            System.out.println("\nЗадача 4: Введите текст для добавления в конец файла (Ctrl+D для завершения):");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Данные добавлены в конец файла.");
        } catch (IOException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }
          */
    }
}
