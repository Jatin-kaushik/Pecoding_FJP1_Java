import java.util.ArrayList;
import java.util.Scanner;

public class get_subsequence {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
    }
    
    // Expec = gss(abc) ==> [---, --c, -b-, -bc] + [a--, a-c, ab-, abc]
    // Faith = gss(bc) ==> [--, -c] + [b-, bc]
    // Expec weds Faith ==> [- + gss(bc)] + [a +gss(bc)]

    public static ArrayList<String> gss(String str){
        if (str.length() == 0){
            ArrayList<String> bres = new ArrayList<>(); // Base result jaha kuchni hota vo khali 1 hota h (2pow0 = 1)
            String TheSubsequence = "";
            bres.add(TheSubsequence);
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres){
            mres.add("-" + rstr);
        }
        for (String rstr : rres){
            mres.add(ch + rstr);

    }
    return mres;

}
}
