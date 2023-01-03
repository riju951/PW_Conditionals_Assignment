import java.util.Scanner;

public class One{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int a = scn.nextInt();
        System.out.println(" Enter Breadth : ");
        int b = scn.nextInt();
        if(a==b){
            System.out.println("Square");
        }
        else{
            System.out.println("rectangle");
        }
    }
}