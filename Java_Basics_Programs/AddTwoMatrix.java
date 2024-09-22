import java.util.*;
class AddTwoMatrix{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m,n,i,j;
    System.out.println("Enter the no of rows and columns:");
    m=sc.nextInt();
    n=sc.nextInt();
    int[][] mat1=new int[m][n];
    int[][] mat2=new int[m][n];
    int[][] sum=new int[m][n];
    System.out.println("Enter the element into first Matrix:");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            mat1[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter the element into Second Matrix:");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            mat2[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            sum[i][j]=mat1[i][j]+mat2[i][j];
        }
    }
    System.out.println("Sum of two Matrices is:");
    for(i=0;i<m;i++)
    {
    for(j=0;j<n;j++)
    {
    System.out.print(sum[i][j]);
    }
    System.out.println();
    }
}
}