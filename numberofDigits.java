import java.util.Scanner;

public class numberofDigits {
    

 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter number to counnt its digits:");
        
        int a =sc.nextInt();
       
        int count=0;
        do { 
         int   digit=a%10;
            count++;
            a=a/10;
        } while (a>0);
    
    System.out.println(count);
    }

}
