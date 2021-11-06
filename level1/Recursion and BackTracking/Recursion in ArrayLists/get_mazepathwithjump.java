import java.util.ArrayList;
import java.util.Scanner;

public class get_mazepathwithjump {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        scn.close();
        ArrayList <String> result = mazewithjump(0,0,dr,dc);
        System.out.println(result);
    }

    public static ArrayList<String> mazewithjump(int r, int c, int dr, int dc){
        if (r == dr-1 && c == dc-1){
            ArrayList <String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        else if ()



        return null;

    }
    
}
