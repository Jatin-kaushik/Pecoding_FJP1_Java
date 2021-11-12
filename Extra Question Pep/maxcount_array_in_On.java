import java.util.Scanner;

public class maxcount_array_in_On {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[26];
        String str = scn.next();
        scn.close();
        for(int i = 0; i<str.length(); i++){
            int ascii = str.charAt(i) - 'a';
            arr[ascii] +=1;
        }
        int ans = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] > ans){
                ans = i;
            }
        }
        char res = (char) ans;
        System.out.println(res);

    }     
}
