import java.util.*;
public class MultiplicationTable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        System.out.println("The Multiplication table till "+num+" = ");
        for(int j=2;j<=num;j++){
        for(i=1;i<=10;i++){
            System.out.println(j+"*"+i+"="+(i*j));
        }
        System.out.println();
    }
    }
}
