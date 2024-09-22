//Program to find the sum of all intgers greate than 100 and less than 200 that are divisible by 7
class SumOfIntegers{
    public static void main(String args[]){
        int i,sum=0;
        for(i=100;i<=200;i++){
            if(i%7==0){
               sum=sum+i;
            }
        }
        System.out.println("Sum is = "+sum);
    }
}