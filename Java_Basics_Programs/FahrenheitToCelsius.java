import java.util.*;
public class FahrenheitToCelsius {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     float temperature,celsius;
     System.out.println("Enter a temperature in Fahrenheit");
     temperature=sc.nextFloat();
     celsius=((temperature-32)*5)/9;
     System.out.println("Temperature in Celsius:"+celsius);
 }   
}
