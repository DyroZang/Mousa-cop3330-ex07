/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        final double SQM = .09290304;

        System.out.println("What is the length of the room in feet?" );
        int length = Integer.parseInt(input.nextLine());

        System.out.println("What is the width of the room in feet?" );
        int width = Integer.parseInt(input.nextLine());

        int area = length*width;
        double marea = area*SQM;
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet. \nThe area is\n" + area + " square feet\n" + marea + " square meters");
    }
}