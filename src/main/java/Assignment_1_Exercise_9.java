/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;

public class Assignment_1_Exercise_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
            double sqFeetPerGallon = 350;
        System.out.print("Enter length: ");
            double length = sc.nextDouble(); //take length from user
        System.out.print("Enter width: ");
            double width = sc.nextDouble(); //take width from user
            double totalSq = length*width; //calculate total squre

            int gallon = (int)Math.ceil(totalSq/sqFeetPerGallon); //calculate number of gallon

            System.out.println("You will need to purchase "+gallon+" of paint to cover "+totalSq+" squre feet");


    }
}
