import java.util.Scanner;

public class printtowerofhanoi {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        int t3 = scn.nextInt();
        scn.close();
        toh(n,t1,t2,t3);
    }
// exp = toh(3,a,b,c) = it is supposed to print valid (rule1,2,3) instructions to move 3 discs from a to b using c
// faith1 = toh(2,a,c,b) = it'll print the valid instructions to move 2 discs from a to c using b
// ab top 2 disc c me hain to waps b me laane ke lie faith2 use hogi
// faith2 = toh(2,c,b,a) = it'll print the valid instructions to move 2 discs from c to b using a

//exp weds faith = faith1 --> move 3rd disc from a to b --> then faith2
    public static void toh(int n, int t1, int t2, int t3){ // t1 me 3 disc h, t2 is empty, t3 is empty #Initial phase
        if (n == 0){
            return; // jab 0 disc ho to kuchni krna bhag jaaao
        }
        toh(n-1, t1, t3, t2); // f1 t1 me last badi disc h, t2 is empty, t3 me top 2 discs h
        System.out.println(n + " [" + t1 + " -> " + t2 + "]"); // wedding t1 is empty, t2 me last bdi disc h, t3 me 2top most dics h
        toh(n-1, t3, t2, t1); // f2 ginal phase t1 is empty, t2 me sbb disc h, t3 is empty

    }
    
}
