import java.util.Scanner;

public class six {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int a = scn.nextInt();
        if (a>90)
        System.out.println("A+");
        else if(a>80)
        System.out.println("A");
        else if(a>70)
        System.out.println("B+");
        else if(a>60)
        System.out.println("B");
        else if(a>50)
        System.out.println("C");
        else if(a>40)
        System.out.println("D");
        else if(a>30)
        System.out.println("E");
        else 
        System.out.println("F");
    }
}
