import java.util.Scanner;

public class StringOperations {
    public static void inputStrings(Scanner scanner) {
        System.out.println("Введите несколько чисел через пробел:");
        // scanner.next();
        String  input = scanner.nextLine();
        String[] numbers = input.split(" ");
        // Сохранение в бд
        DBhandler.saveString(input);
        System.out.println("Введенные числа:");
        for (String num : numbers) {
            System.out.println(num);
        }

    }

    public static void StringIntegrity() {
        try {
            int number = scanner.nextInt();

            if (number % 1 == 0) {
                System.out.println("Целое");
            } else {
                System.out.println("Не целое");
            }
        }

    public static void StringParity(){
            try {
                int number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println("Четное");
                } else {
                    System.out.println("Нечетное");
                }
            }
}
