import java.util.Scanner;

public class printfactorial {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        int r = factorial(n-1);
        int fact = n*r;
        return fact;
    }
}
