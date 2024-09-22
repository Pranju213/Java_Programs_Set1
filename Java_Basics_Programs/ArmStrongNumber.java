import java.util.*;
public class ArmStrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,digit,temp,sum=0;
        System.out.println("Enter a Number:");
        num=sc.nextInt();
        temp=num;
        while(num>0){
            digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
