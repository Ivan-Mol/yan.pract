package Sprint1;

import java.util.Scanner;
/*
На вход программа должна получать номер года, а на выходе выводить дату праздника в формате дд.мм.гггг.
Например, ввод: 2000, вывод: 12.09.2000.
Информационная справка:
Порядок определения високосного года:
год, номер которого кратен 400, — високосный;
остальные годы, номер которых кратен 100, — не високосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
остальные годы, номер которых кратен 4, — високосные.*/
public class Praktikum8_Day {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.printf("12.09."+year);
        }
        else {
            System.out.printf("13.09."+year);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}

