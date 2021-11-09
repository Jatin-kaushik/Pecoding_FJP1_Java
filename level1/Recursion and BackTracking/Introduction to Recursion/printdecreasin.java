import java.util.Scanner;

public class printdecreasin {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        decreasing(n);

    }

    public static void decreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }

    
}
