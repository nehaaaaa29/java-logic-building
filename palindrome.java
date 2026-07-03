import java.util.Scanner;

public class palindrome {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter number to check its palindrome or not:");
        
        int a =sc.nextInt();
        int real=a;
       int rev=0;
        
        do { 
         int   digit=a%10;
         rev=rev*10+digit;
            a=a/10;
        } while (a>0);
    

        if(real==rev){
            System.out.print("it is palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
    
    }
}
