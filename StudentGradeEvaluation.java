//package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String s =sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your score");
        int score = sc.nextInt();
        String ss ="";
        if(score>=90)
        ss="A";
        else if(score>=80 && score<=89)
        ss="B";
        else if(score>=70 && score<=79)
        ss="C";
        else if(score>=80 && score<=69)
        ss="D";
        else if(score<60)
        ss="F";
        if(age<25 && (ss.equals("A") || ss.equals("B")))
        {
            System.out.println("Name: " + s);
            System.out.println("Age: "+ age);
            System.out.println("Score: "+ score);
            System.out.println("Grade: "+ss);
            System.out.println("Yes, he is elgible for scholorship");
        }
        else
        {
            System.out.println("Name: " + s);
            System.out.println("Age: "+ age);
            System.out.println("Score: "+ score);
            System.out.println("Grade: "+ss);
        }

        

        // Prompt the user to enter their age
        

        // Prompt the user to enter their exam score
        

        // Determine the grade
        String grade;
        

        // Print the student's details
        

       
    }
}
