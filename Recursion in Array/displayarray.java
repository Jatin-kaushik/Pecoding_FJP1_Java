import java.util.*;

public class displayarray {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int [n];
        for (int i = 0; i <n; i++){
            int ele = scn.nextInt();
            array[i] = ele;
        }
        scn.close();
        display(0, array);
    }
    
    public static void display (int idx, int [] arr){
        if (idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        display(idx+1, arr);
    }
}
