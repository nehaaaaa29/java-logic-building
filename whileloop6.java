//calculate sum of first n natural number
import java.util.Scanner;


public class whileloop6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number till which you want sum:");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n){
               sum=sum+i;
               i++;
        }
         System.out.println(sum);
        }
    
}
