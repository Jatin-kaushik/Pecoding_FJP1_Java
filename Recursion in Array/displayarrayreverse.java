import java.util.*;


public class displayarrayreverse {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int [n];
        for (int i = 0; i <n; i++){
            int ele = scn.nextInt();
            array[i] = ele;
        }
        scn.close();
        displayreverse(0, array);
    }
    
    public static void displayreverse (int idx, int [] arr){
        if (idx == arr.length){
            return;
        }
        displayreverse(idx+1, arr);
        System.out.println(arr[idx]);

    }
}
