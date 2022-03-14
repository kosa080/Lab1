package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] arys){
        Scanner input = new Scanner(System.in);
        int num1=0;
        do {
            System.out.print("Podaj liczbe do zamiany: ");
            num1 = input.nextInt();
            System.out.println("Podstac szesnastkowa " + Integer.toHexString(num1));
            System.out.println("Podstac dwojkowa " + Integer.toBinaryString(num1));
        } while (true);
    }
}
