import java.util.Scanner;

public class Three {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        int a = scn.nextInt();
        System.out.println("Enter the Selling price : " );
        int b = scn.nextInt();
        if ( a>b ){
            int c=a-b;
            System.out.println("Loss = " + c );
        }
        else
        {
            int d=b-a;
        System.out.println("Profit = " + d );
        }
    }
}
