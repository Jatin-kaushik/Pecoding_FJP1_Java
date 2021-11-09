import java.util.Scanner;

public class printpowerlinear {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        scn.close();
        int res = lp(n,p);
        System.out.println(res);
    }

    public static int lp(int n, int p){
        if (p == 0){
            return 1;
        }

        int linpow = lp(n, p-1);
        int ans = n * linpow;
        return ans;
    }
    
}
