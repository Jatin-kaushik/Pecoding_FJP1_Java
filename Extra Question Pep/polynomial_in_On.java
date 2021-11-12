import java.util.Scanner;

public class polynomial_in_On {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();
        int res = polynomial(x,n);
        System.out.println(res);
    }
//bhaiya copy ni kr pata hu chat off ho jati h
    public static int polynomial(int x, int n){
        int ans = 0;
        int temp = x;
        for (int i =n; i>0; i--){
            int res = n*temp;
            ans = ans + res;
            n--;
            temp = temp*x;
        }
        return ans;
    }

    
}
