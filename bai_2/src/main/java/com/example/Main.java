// Viet chuong trinh tinh tong S = 1 + 2 + 3 + ... + n. n la so  nguyen khong am
package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputNumber();
    }

    static void inputNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Input number ");
        number = sc.nextInt();
        checkNumberIsPositive(number);
        caculateNumber(number);
    }

    static void checkNumberIsPositive(int number) {
        if (number < 0) {
            while (number < 0) {
                System.out.println("Number must not be negative");
                System.out.print("Input number again: ");
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
            }
        }
    }

    static void caculateNumber(int number) {
        int total = 0;
        for (int i = 0; i <= number; i++) {
            total += i;
        }
        System.out.print("Result: " + total);
    }
}