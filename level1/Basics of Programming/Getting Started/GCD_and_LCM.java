import java.util.*;

public class GCD_and_LCM {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int gcd = 1;
        int prod = n1*n2;
        while(n1%n2 !=0){//jabtak modulus 0 ni aajata
            int r = n1%n2; // reminder
            n1 = n2; // gcd rule jisne divide kra vo divide hoga and jo reminder aya tha vo divide krega
            n2 = r; // thats why reinitializing both n2 divide hoga n1 = n2 and reminder divide krega n2 = r
//            System.out.println(r + " " + n1 + " " + n2);
            gcd = r;
        }
        int lcm = prod/gcd; // lcm = (n1*n2)/gcd
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
