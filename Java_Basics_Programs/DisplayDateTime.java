//import java.lang.classfile.ClassFile;
import java.util.*;
public class DisplayDateTime {
    public static void main(String[] args) {
        int hour,minute,second;
        int day,month,year;
        GregorianCalendar date=new GregorianCalendar();
        day=date.get(Calendar.DAY_OF_MONTH);
        month=date.get(Calendar.MONTH);
        year=date.get(Calendar.YEAR);
        second=date.get(Calendar.SECOND);
        minute=date.get(Calendar.MINUTE);
        hour=date.get(Calendar.HOUR);
        System.out.println("Current date is: "+day+"/"+(month+1)+"/"+year);
        System.out.println("Current time is:"+hour+"/"+minute+"/"+second);
    }
}
