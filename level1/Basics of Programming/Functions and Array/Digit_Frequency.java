import java.util.Scanner;

public class Digit_Frequency {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        scn.close();
        int f = getDigitFrequency(n,d);
        System.out.println(f);
    }
    public static int getDigitFrequency(int num, int dig){
        int freq = 0;
        while (num >0){
            int rem = num%10;
            int quo = num/10;
            if (rem == dig){
                freq++;
            }
            num = quo;
        }
        return freq;
    }
    
}
