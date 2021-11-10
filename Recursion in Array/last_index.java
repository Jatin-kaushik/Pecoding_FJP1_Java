import java.util.Scanner;

public class last_index {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int ele = scn.nextInt();
        scn.close();
        int result = lastindex(arr, 0, ele);
        System.out.println(result);
    }

    public static int lastindex(int [] arr, int idx, int ele){
        if (idx == arr.length){
            return -1;
        }

        int li = lastindex(arr, idx+1, ele);
        if (li == -1){
            if (arr[idx] == ele){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }
    
}
