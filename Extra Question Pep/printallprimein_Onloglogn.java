// previous one was n route n and this one is nloglogn (n logstarn) 
//seive of erasthostemic proof
import java.util.Scanner;

public class printallprimein_Onloglogn {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        boolean [] arr = new boolean[n+1];
        for(int i = 2; i*i < arr.length; i++){
            if (arr[i] == false){
                for(int ja = i; i*ja< arr.length; ja++){
                    arr[i*ja] = true;   
                }
            }
        }
        for (int i =2; i<arr.length; i++){
            if (arr[i] == false){
                System.out.println(i);
            }
        }
    }
    
}
