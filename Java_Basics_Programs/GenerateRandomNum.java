//Program to generate the 5 random number between 1 to 100
import java.util.*;
public class GenerateRandomNum {
    public static void main(String[] args) {
        Random rand=new Random();
        for(int j=1;j<=5;j++){                 
        int i=rand.nextInt(1,100);
        System.out.println(i);
    }
}
}
