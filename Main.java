package com.practicejava;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.text.NumberFormat;
//import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // class exercise 3/1/2022
        // print out csv into java console using print f in this format ex.
        //Course Code:  xxxx Course Name: xxxxx xxxx  Course Instructor: xxxxx xxxxx
        // using hello.txt that i created. Want to read file in IDE

        //Step 1.
            File file = new File("C:\\Users\\blnos\\IdeaProjects\\CoreJavaBasics\\src\\com\\courses.txt");
            if(file.exists()) {
                System.out.println("File Exists: " + file.exists());
                try {
                    Scanner input = new Scanner(file); // read from file
                while(input.hasNextLine()) {
                        String[] names = input.nextLine().split(",");
                        System.out.printf("Course Code: %-5s  Course Name: %-16s |Course Instructor: %s \n",names[0],names[1],names[2]);
                    }
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                }




       // below is my mortgage simulator
//
//       final int monthsInYear = 12;
//       final int percent = 100;
//       int principal = 0;
//       double monthlyInterest = 0;
//       int numberOfPayments = 0;
//
//        // get Principal
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        while(true) {
//            System.out.print("Principal: ");
//            principal = scanner.nextInt();
//            if (principal >= 1000 && principal <= 1_000_000)
//                break;
//            System.out.println("Enter a value between $1K and $1M");
//        }
//
//        // get APR and monthly interest
//
//        while(true) {
//            System.out.print("Annual Percentage Rate (APR): ");
//            double annualInterest = scanner.nextDouble();
//            monthlyInterest = annualInterest / percent / monthsInYear;
//            if (annualInterest > 0 && annualInterest <= 30)
//                break;
//            System.out.println("Enter a rate between 0 and 30.");
//
//
//        }
//        // get period
//
//        while(true) {
//            System.out.print("Period in Years: ");
//            int periodInYears = scanner.nextInt();
//            numberOfPayments = periodInYears * monthsInYear;
//            if (periodInYears >= 0 && periodInYears <= 30)
//                break;
//            System.out.println("Enter a year period between 1 and 30 years.");
//        }
//
//      // get calculation to get Mortgage Payments (Monthly)
//
//        double mortgage = principal
//                        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                        / (Math.pow(1 + monthlyInterest, numberOfPayments)-1);
//
//
//       String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//            System.out.println("Mortgage: " + mortgageFormatted);

    } // end main method

} // end Main Class
