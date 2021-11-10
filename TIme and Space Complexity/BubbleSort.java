import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int[n];
        for (int i = 0; i<n; i++){
            array[i] = scn.nextInt();
        }
        scn.close();
        bubble(array);
        print(array);
    }

    public static boolean checkswap(int[] array, int fi, int si){
        System.out.println("Comparing " + array[fi] + " and " + array[si]);
        if(array[fi]>array[si]){
            return true;
        }
        return false;
    }

    public static void swap(int[] array, int fi, int si){
        if (array[fi]> array[si]){
            System.out.println("Swapping " + array[fi] + " and " + array[si]);
            int temp = array[si];
            array[si] = array[fi];
            array[fi] = temp;
        }
    }
    public static void bubble(int[] array){
        for (int itr = 1; itr < array.length; itr++){
            for (int j = 0; j<array.length-itr; j++){
                if (checkswap(array, j , j+1) == true){
                    swap(array, j, j+1);
                }
            }
        }
    }

    public static void print(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
}