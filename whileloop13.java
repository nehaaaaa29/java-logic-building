// Check whether the given number is a palindrome.

import java.util.Scanner;

public class whileloop13 {
    public void palindrome(int  n , int rev){
        
    }
     public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the number:");
          int n = sc.nextInt();
        int rev=0;
        int i=n;
        while(i>0){
            int rem=i%10;
             rev=rem+rev*10;
             i=i/10;
        }
        
        System.out.println(rev);
        System.out.println(n);
        if(rev==n){
        System.out.println("It is a palindrome");
        }

        else{
            System.out.println("it is not a palindrome");
        }

    }
    
}
