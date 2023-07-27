import java.util.Scanner;

public class palindromeNo {
    public static void main(String[] args)
    {   int temp,sum=0;
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=cin.nextInt();
        int newnum=num;
        do
        {
            temp=num%10;
            sum=sum*10+temp;
            num=num/10;
        }while(num!=0);
        if(sum==newnum)
        System.out.println("The number "+sum+" is palindrome.");
        else
        System.out.println("The number "+sum+" is not a palindrome.");
        
    }
    
}
