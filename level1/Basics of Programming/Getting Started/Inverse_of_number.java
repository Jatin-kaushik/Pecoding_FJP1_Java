import java.util.*;
public class Inverse_of_number {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int p =1;
        int inv = 0;
        while(n>0){
            int r = n%10;
            int q = n/10;
            n = q;
            inv = inv + p*(int)Math.pow(10,r-1);
            p++;
        }
        System.out.println(inv);
    }
}

