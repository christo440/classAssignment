package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Read a one number with Scanner
        //Print the multiplication table of the number from 1 till 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number?");
        int number = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " " + "*" + " " + i + " " + "=" + (i * number));
        }
    }
}
