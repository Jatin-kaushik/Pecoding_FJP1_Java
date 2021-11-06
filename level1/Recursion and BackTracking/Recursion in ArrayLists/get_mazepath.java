import java.util.*;

public class get_mazepath {
    public static void main(String [] args){
        Scanner scn  = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        scn.close();
        ArrayList <String> paths = getMazePaths(0, 0, r, c); // sr, sc = 0,0 and dr,dc = in input
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr>dr || sc >dc){ // agar bahar nikal jaaae too
            ArrayList <String> bres = new ArrayList<>();
            return bres;
        }
        else if (sr == dr-1 && sc == dc-1 ){
            ArrayList <String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList <String> mypaths = new ArrayList<>();
        
        ArrayList <String> myhpaths = getMazePaths(sr, sc+1, dr, dc);
        ArrayList <String> myvpaths = getMazePaths(sr+1, sc, dr, dc);

        for (String myhpath: myhpaths){
            mypaths.add("h" +myhpath);
        }
        for (String myvpath: myvpaths){
            mypaths.add("v" +myvpath);
        }
        return mypaths;
    }
}

