package com.company.level1.basicsofprogramming;
import java.util.*;

public class All_prime_till_n {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int i = low; i<=high; i++){
            boolean isprime = true;
            int div = 2;
            while(div*div<=i){
                if (i%div ==0){
                    isprime = false;
                    break;
                }
                div++;
            }
            if (isprime == true){
                System.out.println(i);
            }
        }
    }
}