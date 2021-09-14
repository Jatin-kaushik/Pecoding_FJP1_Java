package com.company.level1.basicsofprogramming.pattern;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n-1;// spaces
        int nst = 1; // Stars
        for(int i =n; i>=1;i--){
            for (int j =1; j<=nsp; j++){
                System.out.print("\t");
            }
            for (int j =1; j<= nst; j++){
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }

    }
}