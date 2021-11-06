import java.util.*;

public class getstairpath {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        ArrayList<String> gss = getstairpaths(n);
        System.out.println(gss);
    }

    public static ArrayList<String> getstairpaths(int n){
        if (n ==0){
            ArrayList <String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        else if (n<0){
            ArrayList <String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList <String> pm1 = getstairpaths(n-1); // paths from n-1 
        ArrayList <String> pm2 = getstairpaths(n-2); // paths from n-2
        ArrayList <String> pm3 = getstairpaths(n-3); // paths from n-3

        ArrayList <String> pfn = new ArrayList<>(); // paths from n

        for (String p1 : pm1){ // jo bhi aaye pm1 se uske aage 1 laga do
            pfn.add(1+p1);
        }
        for (String p2 : pm2){
            pfn.add(2+p2);
        }
        for (String p3 : pm3){
            pfn.add(3+p3);
        }
        return pfn;
        
    }
    
}
