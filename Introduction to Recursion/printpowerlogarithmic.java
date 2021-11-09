import java.util.Scanner;
// differecne power liner o(n) tak jaa rha tha solve krne bt power log har baar n/2 se divide krdeda and o(logn) tk jayega bss
public class printpowerlogarithmic {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        scn.close();
        int res = powlog(n,p);
        System.out.println(res);
    }

    public static int powlog( int n, int p){
        if (p == 0){
            return 1;
        }
        // pow(X, 1024) = pow(X, 512) * pow(X, 512), if its is even
        // pow(X, 1025) = pow(X, 512) * pow(X, 512) * X, if its is odd
        int pnb2 = powlog(n, p/2);
        int pn = pnb2 * pnb2;

        if (p%2 == 1){ // agar power odd hui to 
            pn = pn * n;
        }
        return pn;
    }
    
}
