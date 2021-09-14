package com.company.level1.basicsofprogramming.pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int insp = n/2+1; // handling inner space
        int onsp = 0; //handling outer space

        for (int i = 1; i<= n/2; i++){ // 1st half
            for (int j =1; j <= onsp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j =1; j <= insp; j++){
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
            insp -=2;
            onsp++;
        }
        for (int i = 1; i <= n/2; i++){ // middle row
            System.out.print("\t");
        }
        System.out.print("*");
        System.out.println();

        insp +=2;// balancing the space and factor
        onsp--;

        for (int i = 1; i<= n/2; i++){ // last half
            for (int j =1; j <= onsp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j =1; j <= insp; j++){
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
            insp+=2;
            onsp--;
        }
    }
}
