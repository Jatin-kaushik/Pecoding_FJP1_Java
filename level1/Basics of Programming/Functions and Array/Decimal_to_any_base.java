import java.util.*;

public class Decimal_to_any_base {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int conv_num = getValueInBase(n,b);
        System.out.println(conv_num);
    }
    public static int getValueInBase(int num, int base){
        int ans = 0;
        int pow = 1; // 10 power 0 is 1
        while (num >0) {
            int rem = num%base;
            num = num/base;
            ans += rem * pow;
            pow*=10;
        }
        return ans;
    }
}
