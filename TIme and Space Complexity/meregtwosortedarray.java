import java.util.Scanner;

public class meregtwosortedarray {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] arr1 = new int[n1];
        for (int i = 0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();
        int [] res = mergearray(arr1, arr2);
        print(res);
    }
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
          System.out.println(arr[i]);
        }
      }

    public static int [] mergearray(int [] arr1, int [] arr2){
        int [] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2[i]){
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        if (i == arr1.length){
            while(j<arr2.length){
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        else if(j == arr2.length){
            while(i<arr1.length){
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }
        return ans;
    }
}