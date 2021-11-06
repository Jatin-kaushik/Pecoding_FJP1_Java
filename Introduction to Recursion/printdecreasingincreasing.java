import java.util.Scanner;

public class printdecreasingincreasing {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int m = n;
        scn.close();
        decreasing(n);
        increasing(n);

    }

    public static void decreasing(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }

    public static void increasing(int n){
        if (n == 0){
            return;
        }
        increasing(n-1);
        System.out.println(n);

    }
}
