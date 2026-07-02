//Reverse the given number and print the reversed value.
import java.util.Scanner;

public class whileloop12 {
    public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the number:");
        int n = sc.nextInt();
        int rev=0;
        while(n>0){
            int rem=n%10;
             rev=rem+rev*10;
             n=n/10;
        }
        System.out.println(rev);

    }
    
}
