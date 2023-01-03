import java.util.Scanner;

public class Four {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scn.nextInt();
        if ( a > 0 )
        System.out.println(a);
        else
        System.out.println("The number is negative and skipped");
    }
}
