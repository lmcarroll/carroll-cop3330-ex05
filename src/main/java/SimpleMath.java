/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner input = new Scanner(System.in);
        String NumString = input.nextLine();
        int FirstNumInt = Integer.parseInt(NumString);

        System.out.println("What is the second number?");
        input = new Scanner(System.in);
        NumString = input.nextLine();
        int SecondNumInt = Integer.parseInt(NumString);

        int summation = FirstNumInt + SecondNumInt;
        int difference = FirstNumInt - SecondNumInt;
        int product = FirstNumInt * SecondNumInt;
        int quotient = FirstNumInt / SecondNumInt;

        System.out.println(FirstNumInt + "+" + SecondNumInt + "=" + summation + "\n"
                + FirstNumInt + "-" + SecondNumInt + "=" + difference + "\n"
                + FirstNumInt + "*" + SecondNumInt + "=" + product + "\n"
                + FirstNumInt + "/" + SecondNumInt + "=" + quotient + "\n");
    }
}
