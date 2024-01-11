// Tim giai thu n!
package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputNumber();
    }

    static void inputNumber() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n!: ");
        number = sc.nextInt();
        caculateNum(number);
    }

    public static void caculateNum(int number) {
        int total = 1;
        int startNumber = 2;
        if (number == 0 || number == 1) {
            total = 1;
        } else {
            do {
                total *= startNumber;
                startNumber++;
            } while (startNumber <= number);
        }
        System.out.print("Result " + total);
    }
}
