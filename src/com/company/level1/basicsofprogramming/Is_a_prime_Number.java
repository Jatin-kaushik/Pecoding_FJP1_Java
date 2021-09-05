package com.company.level1.basicsofprogramming;
import java.util.*;

public class Is_a_prime_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for (int i = 1; i<=n; i++){
            boolean isPrime = true;
            int ele = scn.nextInt();
            int div = 2;
            while(div*div <= ele){
                if (ele%div ==0){
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime == true){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}
