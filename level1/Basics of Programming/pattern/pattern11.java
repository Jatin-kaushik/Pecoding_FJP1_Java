import java.util.Scanner;

public class pattern11 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int str = 1;
        int val = 1;
        for(int i = 1; i<=n; i++){
            for (int j =1; j<= str; j++){
                System.out.print(val + "\t");
                val++;
            }
            str++;
            System.out.println();
        }
    }
}
