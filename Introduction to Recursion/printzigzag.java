import java.util.Scanner;


// exp pzz(3) = 321112111232111211123
// faith pzz(2) = 211121112
// exp weds faith = print(n)   :--> n + pzz(n-1) + n.......... jabtk n = 0  na ho jaye
//                  pzz(n-1)
//                  print(n)
//                  pzz(n-1)
//                  print(n)

public class printzigzag {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        pzz(n);
        
    }

    public static void pzz(int n){
        if (n == 0){
            return;
            }
        System.out.print(n); // pre
        pzz(n-1);
        System.out.print(n); // in
        pzz(n-1);        
        System.out.print(n); // post
    }
    
}
