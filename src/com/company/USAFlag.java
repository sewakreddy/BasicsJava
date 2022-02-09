package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class USAFlag {
    public void flag() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a character to view USA flag");
        String character = user_input.next();

        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();
        for (int a = 0; a <= 8; a++) {

            if ((a % 2) == 0) {
                A.forEach(i -> A.add("*"));
                B.forEach(i -> B.add("="));
                System.out.println();
            }
        }
        A.forEach(i -> System.out.println(i));
    }
//            else{
//                for(int d=0; d<=4; d++) {
//                    System.out.print(" *");
//                }
//                System.out.print("  ");
//                for(int e=0; e<=24;e++)
//                {
//                    System.out.print("=");
//                }
//                System.out.println();
//            }



}
