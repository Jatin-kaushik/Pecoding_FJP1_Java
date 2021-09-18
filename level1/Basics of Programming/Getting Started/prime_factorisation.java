import java.util.*;

public class prime_factorisation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int f = 2; f*f <=n; f++){//  har number ka factor uske route se phle hota hain... thats why checking till route n
            while(n%f == 0){
                System.out.print(f + " ");
                n = n/f;
            }
        }
        if (n>0){ // special case for prime numbers like 46
            System.out.print(n);
        }
    }
}
