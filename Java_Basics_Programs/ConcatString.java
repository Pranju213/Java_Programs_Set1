public class ConcatString {
public static void main(String[] args) {
    int num=Integer.parseInt(args[0]);
    String result=" ";
    for(int i=1;i<=num;i++){
        result=result+i+" ";
    }
    System.out.println(result);
}    
}
