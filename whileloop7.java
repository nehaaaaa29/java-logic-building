//calculate and print the sum of even numbers
import java.util.Scanner;

public class whileloop7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number till which you want sum:");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n){
            if(i%2==0){
             sum=sum+i;
               i++;
            }
              i++;
        }
         System.out.println(sum);
        }
}
