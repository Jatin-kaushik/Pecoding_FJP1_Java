package com.company.level1.basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // assuming a is max and checking with b and c
        if (b>a && b >c){
//            System.out.println("b is max");
            if (b*b == c*c + a*a){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        else if (c>a && c >b){
//            System.out.println("c is max");
            if (c*c == b*b + a*a){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        else{
//            System.out.println("a is max");
            if (a*a == b*b + c*c){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
    }
}
