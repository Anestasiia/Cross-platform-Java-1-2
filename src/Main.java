import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task2");

        int num;

        //ввід цілого числа
        while(true) {
        System.out.print("Enter a three-digit number: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num >=100 && num <=999) {
                break;
            } else {
                System.out.println("Please enter a three-digit number:");
            }
        } else {
            System.out.println("Please enter integer number:");
            scanner.next();
        }
        }
        int hundreds, tens, ones;

        //Обрахунок сотень
        hundreds = num / 100;
        //обрахунок десятків
        tens = num / 10 % 10;
        //обрахунок одиниць
        ones = num % 10;

        //обрахунок результуючого числа
        int result = tens * 100 + hundreds * 10 + ones;

        System.out.print("Result number: " + result);
    }
}