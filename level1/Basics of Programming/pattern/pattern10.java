import java.util.Scanner;

public class pattern10 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int osp = n/2;
        int isp = -1;
        for (int i =1; i<=n; i++){
            // System.out.println(osp + ", " + isp);
            for (int j =1;j<=osp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j =1; j<=isp; j++){
                System.out.print("\t");
            }
            if (i>1 && i<n){
                System.out.print("*\t");
            }
            System.out.println();
            if (i<=n/2){
                osp--;
                isp+=2;
            }
            else{
                osp++;
                isp -=2;
            }
        }
    }
}
