package com.bridgelabzs;
import java.util.Scanner;
public class TwoStringsEqualorNot {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.printf("Enter String1");
        String Str1= sc.nextLine();
        System.out.printf("Enter String2");
        String Str2= sc.nextLine();

        if (Str1.equals(Str2))
            System.out.printf("Equal Strings");
        else
            System.out.printf("Unequal Strings");

    }
}
