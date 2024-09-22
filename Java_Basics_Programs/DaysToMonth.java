import java.util.*;
public class DaysToMonth {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int d;
      int year,weeks,month;
      int days;
      System.out.println("Enter a no.of days : ");
      d=sc.nextInt();
      days=d%30;
      month=d/30;
     System.out.println(d+"days="+month+" month and "+days+" days");
    // year=d/365;
    // weeks=(d%365)/7;
    // days=d-((year*365)+(weeks*7));
    // System.out.println(d+"days="+year+" Year and "+days+" days");
  }  
}
