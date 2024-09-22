import java.util.*;
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        int total;
        System.out.println("Enter Student Marks:");
        marks=sc.nextInt();
        total=marks/10;
        switch(total){
            case 10:
            System.out.println("Outstanding");
            break;
            case 9:
            System.out.println("Excellent");
            break;
            case 8:
            System.out.println("Very Good");
            break;
            case 7:
            System.out.println("Good");
            break;
            case 6:
            System.out.println("Average");
            break;
            case 5:
            System.out.println("Poor");
            break;
            case 4:
            System.out.println("fail");
            break;
            default:
            System.out.println("Invalid Choice!");

        }
    }
}
