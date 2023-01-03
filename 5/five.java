import java.util.*;
public class five {
public static void main(String[] args) {
char op;
Double num1;
Double num2;
Double ans;
Scanner scn = new Scanner(System.in);
System.out.print("Enter an operator: (+, -, *, or /)");
op = scn.next().charAt(0);
System.out.print("Enter first number : ");
num1 = scn.nextDouble();
System.out.print("Enter second number : ");
num2 = scn.nextDouble();
switch (op) {
case '+':
ans = num1 + num2;
System.out.println(num1 + " + " + num2 + " = " + ans);
break;
case '-':
ans = num1 - num2;
System.out.println(num1 + " - " + num2 + " = " + ans);
break;
case '*':
ans = num1 * num2;
System.out.println(num1 + " * " + num2 + " = " + ans);
break;
case '/':
ans = num1 / num2;
System.out.println(num1 + " / " + num2 + " = " + ans);
break;
default:
System.out.println("Error! The operator is not correct");
break;
}
}
}