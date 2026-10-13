import java.util.Scanner;

public class reversedValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter number to print its reverse:");
        
        int a =sc.nextInt();
       int rev=0;
        
        do { 
         int   digit=a%10;
         rev=rev*10+digit;
            a=a/10;
        } while (a>0);
    
    System.out.println(rev);
    }

    
}
