package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] arys){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Podaj pierwsza liczbe: ");
        num1 = input.nextInt();
        System.out.print("Podaj druga liczbe: ");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n",num1,num2,num1+num2);
    }
}
