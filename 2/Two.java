import java.util.Scanner;
import java.lang.Math;

public class Two {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if ( a<0 ){
            a = Math.abs(a);
        }
        System.out.println(a);
    }
}
