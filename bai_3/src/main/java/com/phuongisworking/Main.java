// Kiem tra 3 so nguyen la canh cua tam giac khong. Dung thi tinh chu vi, dien tich
// TH tam giac binh thuong
package com.phuongisworking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First side: ");
        int firstSide = sc.nextInt();
        System.out.print("Second side: ");
        int secondSide = sc.nextInt();
        System.out.print("Third side: ");
        int thirdSide = sc.nextInt();
        checkIfThisIsATriangle(firstSide, secondSide, thirdSide);
    }

    static void checkIfThisIsATriangle(int firstSide, int secondSide, int thirdSide) {
        if ((firstSide + secondSide > thirdSide) || (secondSide + thirdSide > firstSide)
                || (firstSide + thirdSide > secondSide)) {
            caculatePerimeter(firstSide, secondSide, thirdSide);
            caculateArea(firstSide, secondSide, thirdSide);
        } else{
            System.out.println("This is not a triangle");
        }
    }

    static void caculatePerimeter(int first, int second, int third) {
        int total = first + second + third;
        System.out.println("Total is: " + total);
    }

    static void caculateArea(int first, int second, int third) {
        int total = (first + second + third) / 2;
        System.out.println("Area is: " + total);
    }
}