import java.util.*;
public class grading_system {
    public static void main(String[] args){
        System.out.println("please give Input");
        Scanner scn = new Scanner(System.in); // creating scanner for input
        int marks = scn.nextInt(); // stroing input in marks as integer
        scn.close();
        if(marks >90) {
            System.out.println("excellent");
        }
        else if(marks >80 && marks <=90) {
            System.out.println("good");
        }
        else if(marks >70 && marks <= 80) {
            System.out.println("fair");
        }
        else if(marks >60 && marks <= 70) {
            System.out.println("meets expectations");
        }
        else {
            System.out.println("below par");
        }
    }
}
