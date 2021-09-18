import java.util.*;
public class rotate_a_number {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        scn.close();
        int temp = n;
        int nod = 0;
        while(temp>0){
            nod++;
            temp = temp/10;
        }
        r = r%nod; // Special case 1 rotation greater thn counts of number r%count
        if (r<0){// Special case 2 rotation is negative r+count
            r = r + nod;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i<=nod; i++){
            if(i<=r){
                div = div*10;
            }
            else{
                mult = mult*10;
            }
        }
        int ansr = (n%div)*mult + n/div;
//        System.out.println(n%div);
//        System.out.println(n/div);
        System.out.println(ansr);

    }
}
