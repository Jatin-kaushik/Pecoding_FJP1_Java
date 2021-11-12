import java.util.Scanner;

public class SelectionSort {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int[n];
        for (int i = 0; i< n; i++){
            array[i] = scn.nextInt();
        }
        scn.close();
        selection(array);
        print(array);
    }

    public static boolean checkswap(int[] array, int fi, int si){
        System.out.println("Comparing " + array[si] + " and " + array[fi]);
        if (array[fi]>array[si]){
            return true;
        }
        return false;   
    }

    public static void swap(int [] array, int fi, int si){
        System.out.println("Swapping " + array[si] + " and " + array[fi]);
        int temp = array[fi];
        array[fi] = array[si];
        array[si] = temp;
    }

    public static void selection(int[] array){
        for (int itr = 0; itr<array.length -1; itr++){
            int minidx = itr;
            for (int j = itr +1 ; j < array.length; j++){
                if (checkswap(array, minidx, j) == true){
                    minidx = j;
                }
            }
            swap(array, itr, minidx);

        }
    }

    public static void print(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
}
