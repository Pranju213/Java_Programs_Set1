import java.util.*;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float temperature,fahrenheit;
        System.out.println("Enter temperature in Celsius:");
        temperature=sc.nextFloat();
        fahrenheit=((9*temperature)/5)+32;
        System.out.println("Temprature in Fahrenheit ="+fahrenheit);
    }
}
