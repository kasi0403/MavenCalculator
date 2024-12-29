package com.app.test.Calculator;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers and operation : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        sc.close();
        switch(op){
        case "+":
        	System.out.println("Addition = "+(a+b));
        	break;
        case "-":
        	System.out.println("Subtraction = "+(a<b?(a-b):(b-a)));
        	break;
        case "*":
        	System.out.println("Multiplication = "+(a*b));
        	break;
        case "/":
        	System.out.println("Division = "+(a>b?(a/b):(b/a)));
        	break;
        }
    }
}
