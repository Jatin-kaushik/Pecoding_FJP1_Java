package com.company.level1.basicsofprogramming.pattern;
import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =0; i<n ;i++){
            int icj = 1;
            for (int j =0; j<=i; j++){
                System.out.print(icj + "\t");
                int icjp1 = icj *(i-j)/(j+1); // formulae to calculcate next combinations
                icj = icjp1;
            }
            System.out.println();
        }

    }
}