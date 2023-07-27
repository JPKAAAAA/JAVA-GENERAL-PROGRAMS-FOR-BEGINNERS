//this program prints bitwise not of given number range


import java.util.Scanner;

public class bitwiseNot {
 public static void main(String[] args)
 {
   Scanner cin=new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num=cin.nextInt();
    for(int i=-num;i<=num;i++)
    System.out.println("bitwise not of "+i+" is "+~i);
 }   
}
