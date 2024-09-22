import java.util.*;
class SumAndProductOfDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,digit;
        int sum=0,product=1;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        while(num>0){
           digit=num%10;
           sum=sum+digit;
           product=product*digit;
           num=num/10;
        }
        System.out.println("Sum of digit in given number ="+sum);
        System.out.println("Product of digit in given number is ="+product);
    }
}