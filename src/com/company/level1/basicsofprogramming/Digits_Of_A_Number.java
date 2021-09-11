package com.company.level1.basicsofprogramming;
import java.util.*;

public class Digits_Of_A_Number {
    /*public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String words = scn.nextLine();
        int i = 0;
        while (i < words.length()){
            System.out.println(words.charAt[i]);
            i++;
        }
    }*/
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int div = 1;
        while(temp>=10){
            temp = temp / 10;
            div = div*10;
        }
        System.out.println(div);

        while(div>=1){
            int quo = n/div;
            int rem = n%div;
//            System.out.println(n +" , " + rem);
            System.out.println(quo);
            n =rem;
            div = div/10;
        }
    }
}
