import java.util.Scanner;

public class linearsearch {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int[n];
        for (int i = 0; i <n; i++){
            array[i] = scn.nextInt();
        }
        int ele = scn.nextInt();
        scn.close();
        int res = ls(ele, array);
        System.out.println(res);
    }

    public static int ls(int ele, int[] array){
        for(int i = 0; i<= array.length; i++){
            if (i < array.length){
                if (array[i] == ele){
                    int j = i;
                    return j;
                }
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}
