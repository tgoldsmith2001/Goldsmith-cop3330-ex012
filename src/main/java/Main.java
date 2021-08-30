/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String Str1=input.nextLine();
        System.out.print("Enter the rate of interest: ");
        String Str2=input.nextLine();
        System.out.print("Enter the number of years: ");
        String Str3=input.nextLine();
        double P= Double.parseDouble(Str1);
        double I= (Double.parseDouble(Str2));
        double T= Double.parseDouble(Str3);
        double total=P*(1+(T*I/100));
        //Multiply by 100 round then divide by 100 to round to two decimal places
        double rounded_Total=Math.round(total*100.0)/100.0;
        System.out.format("After %.0f years at %.2f%%, the investment will be worth $%.2f.",T,I,rounded_Total);
    }
}
