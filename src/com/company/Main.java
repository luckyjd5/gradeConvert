package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentCount = 0;

        System.out.println("How many students are in the class?");
        int totStudents = input.nextInt();
        System.out.println("Total marks of paper:");
        int totMark = input.nextInt();
        while (studentCount < totStudents) {
            System.out.println("Enter student mark:");
            int stuMark = input.nextInt();
            float stuPercent = (float) stuMark / totMark;
            if (stuPercent < 0.4) {
                System.out.println("U\n");
            }
            else {
                if ((stuPercent <= 0.49) && (stuPercent >= 0.40 && stuPercent >= 0)) {
                    System.out.println("E\n");
                    studentCount += 1;
                }
                else {
                    if ((stuPercent <= 0.59) && (stuPercent >= 0.5)) {
                        System.out.println("D\n");
                        studentCount += 1;
                    }
                    else {
                        if ((stuPercent <= 0.69) && (stuPercent >= 0.6)) {
                            System.out.println("C\n");
                            studentCount += 1;
                        }
                        else {
                            if ((stuPercent <= 0.79) && (stuPercent >= 0.7)) {
                                System.out.println("B\n");
                                studentCount += 1;
                            }
                            else {
                                if ((stuPercent <= 1) && (stuPercent >= 0.8)) {
                                    System.out.println("A\n");
                                    studentCount += 1;
                                }
                                else {
                                    System.out.println("Inputted value not valid.");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
