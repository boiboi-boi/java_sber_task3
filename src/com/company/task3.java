package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 11);

        System.out.println("Угадайте число от 0 до 10!");
        System.out.print("Введите число: ");
        int input = scanner.nextInt();

        while (input != number){
            if (input > number)
                System.out.println("Загаданное число меньше!");
            else if (input < number)
                System.out.println("Загаданное число больше!");
            System.out.print("Введите число: ");
            input = scanner.nextInt();
        }

        System.out.println("Вы угадали! Загаданное число: " + number);
    }
}