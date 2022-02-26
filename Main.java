package com.practicejava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       final int monthsInYear = 12;
       final int percent = 100;

        // get Principal

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // get APR and monthly interest

        System.out.print("Annual Percentage Rate (APR): ");
        double apr = scanner.nextDouble();
        double monthlyInterest1 = apr / percent / monthsInYear;

        // get period

        System.out.print("Period in Years: ");
        int periodInYears = scanner.nextInt();
        int numberOfPayments = periodInYears * monthsInYear;

      // get calculation to get Mortgage Payments (Monthly)

        double mortgage = principal
                        * (monthlyInterest1 * Math.pow(1 + monthlyInterest1, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest1, numberOfPayments)-1);


       String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + mortgageFormatted);

    } // end main method

} // end Main Class
