import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int nsp = 0;// spaces
        int nst = n; // Stars
        for(int i =n; i>=1;i--){
            for (int j =1; j<=nsp; j++){
                System.out.print("\t");
            }
            for (int j =1; j<= nst; j++){
                System.out.print("*\t");
            }
            nsp++;
            nst--;
            System.out.println();
        }

    }
}

