import java.util.ArrayList;
import java.util.Scanner;

public class get_kpc {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        String kp = scn.nextLine();
        scn.close();
        ArrayList <String> result = getkpc(kp);
        System.out.println(result);
    }

    static String[] combination = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList <String> getkpc(String kp){
        if (kp.length() == 0){
            ArrayList <String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = kp.charAt(0);
        String ros = kp.substring(1);
        ArrayList <String> rres = getkpc(ros);
        ArrayList <String>  mres = new ArrayList<>();
        // int idx = Integer.parseInt(ch);
        int idx = ch - '0';

        String words = combination[idx];

        for (int i= 0; i < words.length(); i++){
            char word = words.charAt(i);
            for (String res:rres){
                mres.add(word + res);
            }
        }
        return mres;
    }
    
}
