package com.company;

import java.util.Scanner;

public class AmericanFlag{
    public void flag(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a character to view american flag");
        String character = user_input.next();
        for (int a = 0; a<=8 ; a++) {

            if((a%2)==0){
                for(int b=0; b<=5; b++) {
                    System.out.print("* ");
                }
                    for(int c=0; c<=24;c++)
                    {
                        System.out.print("=");
                    }
                System.out.println();
            }
            else{
                for(int d=0; d<=4; d++) {
                    System.out.print(" *");
                }
                System.out.print("  ");
                    for(int e=0; e<=24;e++)
                    {
                        System.out.print("=");
                    }
                System.out.println();
            }
            
        }
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=40 ; j++) {
                System.out.print("=");

            }
                System.out.print("\n");
        }
    }
}
