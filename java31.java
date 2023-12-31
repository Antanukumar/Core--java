// Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
// Enter an operator (+, -, *, /): -
// Enter two numbers:
// 6
// 8

// 6 - 8 = -2
import java.util.*;
class Main {
public static void main(String[] args) {
char op;
Double num1;
Double num2;
Double ans;
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter an operator: (+, -, *, or /)");
    op = sc.next().charAt(0);
    System.out.print("Enter first number : ");
    num1 = sc.nextDouble();
    System.out.print("Enter second number : ");
    num2 = sc.nextDouble();
}
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
